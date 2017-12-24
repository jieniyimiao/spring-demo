package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublish {
    @Autowired
    ApplicationContext appContext;

    public void publish(String msg) {
        appContext.publishEvent(new DemoEvent(this, msg));
    }
}
