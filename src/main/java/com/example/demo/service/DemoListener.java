package com.example.demo.service;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("demoListener <-- [Event]" + demoEvent.getMsg() + "<-- demoPublish");
    }
}
