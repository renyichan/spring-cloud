package com.renyi.user.controller;

import com.google.common.collect.Maps;
import com.renyi.user.module.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by chenrenyi on 2017/1/4.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private DiscoveryClient client;

    private Map<Long,User> users = Maps.newHashMap();

    @RequestMapping("/adduser")
    public void add(String username,long id){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/adduser, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        User user = new User(id,username);
        users.put(id,user);
    }

    @RequestMapping("/adduserandreturn")
    public String addandreturn(String username,long id){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/adduserandreturn, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        User user = new User(id,username);
        users.put(id,user);
        return "ok";
    }

    @RequestMapping("/getuser")
    public User getUser(long id){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/getuser, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return users.get(id);
    }

}
