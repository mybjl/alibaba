package com.lph.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-provider9001")
public interface ConsumerService {

    @GetMapping("/provider")
    public String getServerPort();
}
