package com.renyi.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chenrenyi on 2017/1/4.
 */
@FeignClient(name = "USERSERVICE",fallback = UserClient.HystrixUserClientFallback.class)
public interface UserClient {

    @RequestMapping("/user/adduserandreturn")
    String addandreturn(@RequestParam("username") String username,@RequestParam("id") long id);

    @Component
    class HystrixUserClientFallback implements  UserClient{

        @Override
        public String addandreturn(String username, long id) {
            return "异常发生，进入fallback方法，接收的参数：username"+username+";id"+id;
        }
    }
}
