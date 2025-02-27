package com.realtimechatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RealTimeChatAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealTimeChatAppApplication.class, args);
    }

}
