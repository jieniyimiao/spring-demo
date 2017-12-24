package com.example.demo.ch3;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
    @Async
    public void executorAsyncTask(Integer i) throws InterruptedException {
        System.out.println(i);
        Thread.sleep(20);
    }

    @Async
    public void executorAsyncTaskPlus(Integer i) throws InterruptedException {
        Thread.sleep(50);
        System.out.println("plus : " + i);
    }
}
