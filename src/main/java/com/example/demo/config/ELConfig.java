package com.example.demo.config;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
@Component
@PropertySource("classpath:test.properties")
public class ELConfig {
    @Value("I love You!")
    private String normal;

    @Value("#{demoService.another}")
    private String another;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("classpath:test.txt")
    private Resource testFiel;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    public void outputResource() throws IOException {
        System.out.println(normal);
        System.out.println(another);
        System.out.println(randomNumber);
        System.out.println(osName);
        System.out.println(IOUtils.toString(testFiel.getInputStream(), Charset.defaultCharset()));
        System.out.println(IOUtils.toString(testUrl.getInputStream(), Charset.defaultCharset()));
        System.out.println(bookName);
        System.out.println(environment.getProperty("book.author"));
        System.out.println(environment.getProperty("classpath"));
    }
}
