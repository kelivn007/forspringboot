package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${pocket.name}")
    private String name;

    @Value("${pocket.age}")
    private String age;

    @Value("${pocket.address}")
    private String address;

    @GetMapping("/hello")
    public String hello() {
        return "大家好，我的名字是" + name + "，我今年" + age + "岁了，我在" + address + "好吃懒做！";
    }
}
