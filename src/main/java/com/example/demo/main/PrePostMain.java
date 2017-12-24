package com.example.demo.main;

import com.example.demo.config.PrePostConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
public class PrePostMain {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        //BeanWayService beanWayService = context.getBean(BeanWayService.class);
        //JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}
