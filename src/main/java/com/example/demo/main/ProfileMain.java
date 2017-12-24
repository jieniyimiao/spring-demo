package com.example.demo.main;

import com.example.demo.config.ProfileConfig;
import com.example.demo.service.DemoBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
public class ProfileMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        System.out.println(context.getBean(DemoBean.class).getContext());

        context.close();
    }
}
