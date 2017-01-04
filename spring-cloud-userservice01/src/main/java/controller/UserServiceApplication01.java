package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by chenrenyi on 2017/1/4.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication01.class,args);
    }
}
