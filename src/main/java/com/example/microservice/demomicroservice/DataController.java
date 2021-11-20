package com.example.microservice.demomicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DataController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration getData()
    {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
