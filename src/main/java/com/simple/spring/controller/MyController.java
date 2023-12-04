package com.simple.spring.controller;

import com.simple.spring.entity.EntityWithEnum;
import com.simple.spring.entity.Person;
import com.simple.spring.service.SchedularService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;


@RestController
public class MyController {

    private static  final Logger logger = LoggerFactory.getLogger(MyController.class);

    @Autowired
    private SchedularService schedularService;

    @PostMapping("/testEnum")
    public EntityWithEnum setAccountType(@RequestBody EntityWithEnum entity){
        return entity;
    }

    @GetMapping
    public Person getPerson(){
        Person person = new Person(1, "nikunj", null);
        CompletableFuture.runAsync(this::someMethod);
        someMethod();
//        Thread t1 = new Thread(schedularService);
//        t1.start();
        return person;
    }

    @Async
    public void someMethod(){
        System.out.println("Some method,,");
        logger.info("some logss");
    }
}
