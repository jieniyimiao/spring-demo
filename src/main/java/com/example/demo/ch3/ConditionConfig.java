package com.example.demo.ch3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class ConditionConfig {
    @Bean
    @Conditional(WindowCondition.class)
    WindowsListCmd windowCondition() {
        return new WindowsListCmd();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    LinuxListCmd linuxListCmd() {
        return new LinuxListCmd();
    }

}
