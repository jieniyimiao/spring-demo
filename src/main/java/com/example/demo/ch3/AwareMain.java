package com.example.demo.ch3;

import com.example.demo.config.ProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
public class AwareMain {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);
        context.getBean(AwareService.class).outputResult();

        context.close();
    }
}
