package com.yang.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author TangYuan
 * @create 2021--06--08--16:46
 * @description
 */
@Service
public class ScheduledService {

    @Scheduled(cron = "0/5 * * * * ?")
    public void scheduled(){
        System.out.println("执行定时任务执行");
    }
}
