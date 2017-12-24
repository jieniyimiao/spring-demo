package com.example.demo.config;

import com.example.demo.service.FunctionService;
import com.example.demo.service.UseFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
@Configuration
//@ComponentScan("com.example.demo.service")
public class DiConfig {
   @Bean
   public FunctionService functionService() {
       return new FunctionService();
   }

   @Bean
   public UseFunctionService useFunctionService() {
       return new UseFunctionService(functionService());
   }

}
