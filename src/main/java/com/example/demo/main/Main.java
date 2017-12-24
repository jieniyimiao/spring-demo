package com.example.demo.main;

import com.example.demo.config.AopConfig;
import com.example.demo.config.DiConfig;
import com.example.demo.service.DemoPrototypeService;
import com.example.demo.service.DemoSingletionService;
import com.example.demo.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class, AopConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("world"));

        /*System.out.println("--------------");
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();

        System.out.println("--------------");
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoMethodService.add();*/
        System.out.println(context.getBean(DemoSingletionService.class).equals(context.getBean(DemoSingletionService.class)));
        System.out.println(context.getBean(DemoPrototypeService.class).equals(context.getBean(DemoSingletionService.class)));

        context.close();
    }
}
