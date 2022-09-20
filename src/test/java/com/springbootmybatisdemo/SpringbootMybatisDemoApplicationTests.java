package com.springbootmybatisdemo;

import com.SpringbootMybatisDemoApplication;
import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import com.winter.entity.Dbbardata;
import com.winter.entity.Dbbaroverview;
import com.winter.mapper.DbbardataDao;
import com.winter.mapper.DbbaroverviewDao;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.ListUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@SpringBootTest(classes = SpringbootMybatisDemoApplication.class)
@Slf4j
class SpringbootMybatisDemoApplicationTests {

    @Resource
    private DbbardataDao dbbardataDao;

    @Resource
    private DbbaroverviewDao dbbaroverviewDao;

    @Resource
    private PlatformTransactionManager transactionManager;

    private static ExecutorService executorService = Executors.newFixedThreadPool(10);


    @Test
    @Transactional(rollbackFor = Exception.class)
    public void contextLoads() {

        /*DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
        definition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        final TransactionStatus status = transactionManager.getTransaction(definition);*/
        List<Dbbaroverview> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            Dbbaroverview dbbaroverview = new Dbbaroverview();
            dbbaroverview.setCount(1);
            dbbaroverview.setEnd(new Date());
            dbbaroverview.setInterval(String.valueOf(i));
            dbbaroverview.setSymbol("TC");
            dbbaroverview.setExchange("交易");
            dbbaroverview.setStart(new Date());
            list.add(dbbaroverview);
        }

        System.out.println(System.currentTimeMillis() + "导入开始");
        final List<List<Dbbaroverview>> partition1 = ListUtils.partition(list, 1000);
        partition1.forEach(item -> dbbaroverviewDao.insertList(item));
        //transactionManager.commit(status);
        System.out.println(System.currentTimeMillis() + "导入结束");
        //dbbaroverviewDao.insertList(list);
    }

    /**
     * 多线程事务控制
     */
    @Test
    void mulitThreadTransactional() throws InterruptedException {
        DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
        definition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        final TransactionStatus status = transactionManager.getTransaction(definition);

        List<Dbbaroverview> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Dbbaroverview dbbaroverview = new Dbbaroverview();
            dbbaroverview.setCount(1);
            dbbaroverview.setEnd(new Date());
            dbbaroverview.setInterval(String.valueOf(i));
            dbbaroverview.setSymbol("TC");
            dbbaroverview.setExchange("交易");
            dbbaroverview.setStart(new Date());
            list.add(dbbaroverview);
        }

        System.out.println(System.currentTimeMillis() + "导入开始");
        final List<List<Dbbaroverview>> partition1 = ListUtils.partition(list, 1000);
        // 回滚标志，线程安全
        AtomicBoolean rollbackFlag = new AtomicBoolean(false);
        // 事务计数阀，wait用于子线程内。计数阀清零表示所有事务业务已经结束，主线程可以继续向下走，子线程可以开始判断是否回滚
        CountDownLatch transactionLatch = new CountDownLatch(1);

        partition1.forEach(itme -> executeInsert(itme, rollbackFlag, transactionLatch));

        transactionLatch.await();

        if (rollbackFlag.get()) {
            System.out.println("回滚");
        }
        System.out.println(System.currentTimeMillis() + "导入结束");

    }

    private void executeInsert(List<Dbbaroverview> list, AtomicBoolean rollbackFlag, CountDownLatch transactionLatch) {
        executorService.execute(new Runnable() {
            private final Logger logger = LoggerFactory.getLogger(this.getClass());

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动");
                // 后进线程获取到回滚标志，直接返回
                if (rollbackFlag.get()) {
                    return;
                }
                DefaultTransactionDefinition def = new DefaultTransactionDefinition();
                def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW); // 事物隔离级别，开启新事务，这样会比较安全些。
                TransactionStatus status = transactionManager.getTransaction(def); // 获得事务状态
                try {
                    long start = System.currentTimeMillis();
                    dbbaroverviewDao.insertList(list);

                    // 事务结束，计数阀计数减1
                    transactionLatch.countDown();

                    System.out.println(Thread.currentThread().getName() + "线程等待");
                    // 等待其他事务
                    transactionLatch.await();
                    // 判断回滚
                    if (rollbackFlag.get()) {
                        transactionManager.rollback(status);
                    } else {
                        transactionManager.commit(status);
                    }
                } catch (Exception e) {
                    logger.error("", e);
                    rollbackFlag.set(true);
                    // 事务结束，计数阀计数减1
                    transactionLatch.countDown();
                    transactionManager.rollback(status);
                }
                System.out.println(Thread.currentThread().getName() + "线程结束");
            }
        });
    }
}
