package com.yang.controller;

import com.yang.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TangYuan
 * @create 2021--06--08--15:46
 * @description
 */
@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        asyncService.hello();
        return "ok";
    }
}
