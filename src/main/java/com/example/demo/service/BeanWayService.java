package com.example.demo.service;

public class BeanWayService {
    public void init() {
        System.out.println("@Bean init method");
    }

    public BeanWayService() {
        System.out.println("@Bean construction of beanWayService.");
    }

    public void destroy() {
        System.out.println("@Bean destroy method");
    }
}
