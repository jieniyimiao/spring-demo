package com.example.demo.service;

import java.lang.annotation.*;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
    String name();
}
