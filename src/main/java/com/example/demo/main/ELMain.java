package com.example.demo.main;

import com.example.demo.config.AopConfig;
import com.example.demo.config.DiConfig;
import com.example.demo.config.ELConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
public class ELMain {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class, AopConfig.class);
        ELConfig elConfig = context.getBean(ELConfig.class);
        elConfig.outputResource();

        //得到的是当前类class文件的URI目录。不包括自己！
        System.out.println(ELMain.class.getResource("").getPath());

        //得到的是当前的classpath的绝对URI路径 。
        System.out.println(ELMain.class.getResource("/").getPath());
        System.out.println(ELMain.class.getClassLoader().getResource("").getPath());
        System.out.println(ClassLoader.getSystemResource("") );
        System.out.println(Thread.currentThread().getContextClassLoader ().getResource(""));

        context.close();
    }
}
