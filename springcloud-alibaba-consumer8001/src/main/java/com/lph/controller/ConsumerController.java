package com.lph.controller;


import com.lph.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    private ConsumerService consumerService;

    @GetMapping("consumer")
    public String getProviderServerPort(){
        return consumerService.getServerPort();
    }
}
