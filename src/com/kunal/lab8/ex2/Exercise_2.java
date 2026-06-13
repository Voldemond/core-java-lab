package com.kunal.lab8.ex2;

class TimerThread implements Runnable {

    public void run() {
        try {
            while (true) {
                System.out.println("Timer refreshed at: " + new java.util.Date());

                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Exercise_2 {
    public static void main(String[] args) {

        TimerThread t = new TimerThread();

        Thread thread = new Thread(t);

        thread.start();
    }
}