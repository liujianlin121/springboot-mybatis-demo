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
            dbbaroverview.setExchange("??????");
            dbbaroverview.setStart(new Date());
            list.add(dbbaroverview);
        }

        System.out.println(System.currentTimeMillis() + "????????????");
        final List<List<Dbbaroverview>> partition1 = ListUtils.partition(list, 1000);
        partition1.forEach(item -> dbbaroverviewDao.insertList(item));
        //transactionManager.commit(status);
        System.out.println(System.currentTimeMillis() + "????????????");
        //dbbaroverviewDao.insertList(list);
    }

    /**
     * ?????????????????????
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
            dbbaroverview.setExchange("??????");
            dbbaroverview.setStart(new Date());
            list.add(dbbaroverview);
        }

        System.out.println(System.currentTimeMillis() + "????????????");
        final List<List<Dbbaroverview>> partition1 = ListUtils.partition(list, 1000);
        // ???????????????????????????
        AtomicBoolean rollbackFlag = new AtomicBoolean(false);
        // ??????????????????wait???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        CountDownLatch transactionLatch = new CountDownLatch(1);

        partition1.forEach(itme -> executeInsert(itme, rollbackFlag, transactionLatch));

        transactionLatch.await();

        if (rollbackFlag.get()) {
            System.out.println("??????");
        }
        System.out.println(System.currentTimeMillis() + "????????????");

    }

    private void executeInsert(List<Dbbaroverview> list, AtomicBoolean rollbackFlag, CountDownLatch transactionLatch) {
        executorService.execute(new Runnable() {
            private final Logger logger = LoggerFactory.getLogger(this.getClass());

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "????????????");
                // ????????????????????????????????????????????????
                if (rollbackFlag.get()) {
                    return;
                }
                DefaultTransactionDefinition def = new DefaultTransactionDefinition();
                def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW); // ??????????????????????????????????????????????????????????????????
                TransactionStatus status = transactionManager.getTransaction(def); // ??????????????????
                try {
                    long start = System.currentTimeMillis();
                    dbbaroverviewDao.insertList(list);

                    // ?????????????????????????????????1
                    transactionLatch.countDown();

                    System.out.println(Thread.currentThread().getName() + "????????????");
                    // ??????????????????
                    transactionLatch.await();
                    // ????????????
                    if (rollbackFlag.get()) {
                        transactionManager.rollback(status);
                    } else {
                        transactionManager.commit(status);
                    }
                } catch (Exception e) {
                    logger.error("", e);
                    rollbackFlag.set(true);
                    // ?????????????????????????????????1
                    transactionLatch.countDown();
                    transactionManager.rollback(status);
                }
                System.out.println(Thread.currentThread().getName() + "????????????");
            }
        });
    }
}
