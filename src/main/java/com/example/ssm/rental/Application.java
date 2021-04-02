package com.example.ssm.rental;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <pre>
 *     SENS run!
 * </pre>
 *
 * @author : saysky
 * @date : 2019/11/14
 */
@Slf4j
@SpringBootApplication
@EnableScheduling
@MapperScan("com.example.ssm.rental.mapper")
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        String serverPort = context.getEnvironment().getProperty("server.port");
        log.info("Verio started at http://localhost:" + serverPort);
    }

}
