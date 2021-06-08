package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync //异步任务开启
@EnableScheduling
@SpringBootApplication
public class Springboot05AsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05AsyncApplication.class, args);
    }

}
