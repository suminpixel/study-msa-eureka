package com.dream.testservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class MainController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/ping")
    public void math(){
        this.discoveryClient.getInstances("MATH-SERVICE").stream().forEach(
                d -> {
                    log.info("{}",d);
                }
        );

    }

}
