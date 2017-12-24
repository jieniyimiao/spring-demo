package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.example.demo")
public class AopConfig {
}
