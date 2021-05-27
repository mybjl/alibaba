package com.lph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Config7001 {
    public static void main(String[] args) {
        SpringApplication.run(Config7001.class,args);
    }
}
