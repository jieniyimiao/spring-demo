package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "this is action annotation of aop.")
    public void add() {
        System.out.println("add function");
    }
}
