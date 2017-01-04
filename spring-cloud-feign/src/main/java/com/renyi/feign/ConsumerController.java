package com.renyi.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenrenyi on 2017/1/4.
 */
@RestController
public class ConsumerController {
    @Autowired
    UserClient userClient;
    @RequestMapping(value = "/add")
    public String add() {
        return userClient.addandreturn("renyi",11111l);
    }
}
