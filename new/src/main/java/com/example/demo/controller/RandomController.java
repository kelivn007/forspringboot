package com.example.demo.controller;

import com.example.demo.bean.RandomData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class RandomController {

    @Autowired
    private RandomData randomData;

    @RequestMapping("/random")
    public RandomData RandomMap() {
        return randomData;
    }
}
