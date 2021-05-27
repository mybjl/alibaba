package com.lph.controller;

import com.lph.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class sentinelController {
    @Autowired
    private TestService testService;

    @GetMapping("/testA")
    public String testA(){
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        log.info(Thread.currentThread().getName()+"testA");
        testService.test();
        return "testA";
    }

    @GetMapping("/testB")
    public String testB(){
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        log.info(Thread.currentThread().getName()+"testB");
        testService.test();
        return "testB";
    }

}
