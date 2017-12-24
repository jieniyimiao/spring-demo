package com.example.demo.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    @PostConstruct
    public void init() {
        System.out.println("JSR250 init method");
    }

    public JSR250WayService() {
        System.out.println("JSR250 construction of beanWayService.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JSR250 destroy method");
    }
}
