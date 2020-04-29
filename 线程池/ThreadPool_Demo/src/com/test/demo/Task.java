package com.test.demo;

/**
 * @author: ymy
 * @create: 2020/4/28
 * 线程任务
 */
public class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " running");
    }
}