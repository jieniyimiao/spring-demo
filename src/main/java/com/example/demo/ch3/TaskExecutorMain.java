package com.example.demo.ch3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by jieniyimiao on 2017/12/22.
 */
public class TaskExecutorMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService task = context.getBean(AsyncTaskService.class);
        for (int i = 0 ; i < 100; i++) {
            task.executorAsyncTask(i);
            task.executorAsyncTaskPlus(i);
        }

        context.close();
    }
}
