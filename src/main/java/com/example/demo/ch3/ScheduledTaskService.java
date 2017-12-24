package com.example.demo.ch3;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTime() {
        System.out.println("5s executor " + sdf.format(new Date()));
    }

    @Scheduled(cron = "0 54 21 ? * *")
    public void fixTimeExecutor() {
        System.out.println("5s executor");
    }

}
