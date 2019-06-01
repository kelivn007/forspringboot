package com.example.demo.controller;

import com.example.demo.bean.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class TestController {

    @Autowired
    private TestEntity testEntity;

    @RequestMapping("/test")
    public TestEntity getTestEntity() {
        return testEntity;
    }
}
