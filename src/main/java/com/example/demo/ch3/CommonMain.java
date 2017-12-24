package com.example.demo.ch3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
public class CommonMain {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        context.getBean(DemoService1.class).outputResult();

        context.close();
    }
}
