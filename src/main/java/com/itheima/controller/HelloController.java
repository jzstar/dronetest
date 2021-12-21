package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${itheima.url}")
    private String itheimaUrl;

    @GetMapping("hello")
    public String hello() {
        System.out.println("DataSources = " + dataSource);
        System.out.println("itheimaUrl = " + itheimaUrl);
        return "Hello, springboot!";
    }
}
