package com;

import com.winter.service.CoordinationNettyServer;
import com.winter.service.NioNettyServer;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan(basePackages = "com.winter.mapper")
@Slf4j
public class SpringbootMybatisDemoApplication {

    public static void main(String[] args) {

        final ConfigurableApplicationContext run = SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
        run.getBean(NioNettyServer.class).start();
        try {
            //new CoordinationNettyServer(8090).start();
        } catch (Exception e) {
            log.info("启动服务异常",e);
        }

    }

}
