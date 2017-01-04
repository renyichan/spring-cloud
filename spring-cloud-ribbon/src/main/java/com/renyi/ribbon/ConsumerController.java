package com.renyi.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * Created by chenrenyi on 2017/1/4.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/adduser")
    public String add() {
        Random random = new Random(10000);
        long id = random.nextLong();
        return restTemplate.getForEntity("http://USERSERVICE/user/adduserandreturn?username=renyi"+id+"&id="+id, String.class).getBody();
    }
}
