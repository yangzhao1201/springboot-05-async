package com.yang.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author TangYuan
 * @create 2021--06--08--15:44
 * @description
 */

@Service
public class AsyncService {

    @Async
    public void hello() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("数据正在处理");
    }
}
