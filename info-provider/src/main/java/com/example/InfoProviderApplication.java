package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.example.mapper")
@SpringBootApplication
public class InfoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoProviderApplication.class, args);
    }

}