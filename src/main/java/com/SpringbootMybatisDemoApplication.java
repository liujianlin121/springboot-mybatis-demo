package com;

import com.winter.service.CoordinationNettyServer;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.winter.mapper")
@Slf4j
public class SpringbootMybatisDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);

        try {
            new CoordinationNettyServer(8090).start();
        } catch (Exception e) {
            log.info("启动服务异常",e);
        }

    }

}
