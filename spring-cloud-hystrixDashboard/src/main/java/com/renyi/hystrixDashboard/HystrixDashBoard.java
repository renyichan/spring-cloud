package com.renyi.hystrixDashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by chenrenyi on 2017/1/7.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixDashBoard.class).web(true).run(args);
    }
}
