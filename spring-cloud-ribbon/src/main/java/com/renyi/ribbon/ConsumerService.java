package com.renyi.ribbon;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by chenrenyi on 2017/1/7.
 */
@Service
public class ConsumerService {
    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "addError")
    public String add() {
        Random random = new Random(10000);
        long id = random.nextLong();
        return restTemplate.getForEntity("http://USERSERVICE/user/adduserandreturn?username=renyi"+id+"&id="+id, String.class).getBody();
    }

    public String addError(){
        return "add Error";
    }

}
