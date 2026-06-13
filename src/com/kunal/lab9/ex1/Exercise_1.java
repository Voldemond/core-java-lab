package com.kunal.lab9.ex1;

import java.util.concurrent.*;

public class Exercise_1 {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("Timer: " + new java.util.Date());
        };

        scheduler.scheduleAtFixedRate(task, 0, 10, TimeUnit.SECONDS);
    }
}