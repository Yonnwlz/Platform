package com.lz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.lz.dao")
public class LzAfterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzAfterApplication.class, args);
    }
}
