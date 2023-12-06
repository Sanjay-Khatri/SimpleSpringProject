package com.simple.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.task.TaskSchedulerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class SchedularService implements Runnable{

    @Autowired
    private TaskScheduler taskScheduler;


//    @Scheduled(cron = "0/1 0/1 * 1/1 * ? *")
    public void run(){
        while(true){
            try{
                throw new RuntimeException();
            }catch (Exception e){
                System.out.println("error occur");
            }finally {
                taskScheduler.schedule(this, Instant.now().plusSeconds(10));
            }
        }
    }
}
