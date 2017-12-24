package com.example.demo.service;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
//@Service
public class UseFunctionService {
    //@Autowired
    private FunctionService functionService;

    public UseFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
