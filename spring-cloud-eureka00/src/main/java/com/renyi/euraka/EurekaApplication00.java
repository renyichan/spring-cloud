package com.renyi.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by chenrenyi on 2017/1/4.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication00 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication00.class, args);
    }
}
