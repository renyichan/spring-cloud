package com.renyi.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chenrenyi on 2017/1/4.
 */
@FeignClient("USERSERVICE")
public interface UserClient {

    @RequestMapping("/user/adduserandreturn")
    String addandreturn(@RequestParam("username") String username,@RequestParam("id") long id);
}
