package com.test.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author: ymy
 * @create: 2020/4/28
 * 可调度(定时或延迟执行)
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {

//        创建一个线程池，它可以安排在给定延迟后运行命令或者定时执行
//        特点:
//        1.线程池中具有数量的线程，即使是空线程将保留
//        2.可定时或延迟执行线程活动
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        System.out.println(System.currentTimeMillis());
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟三秒执行");
                System.out.println(System.currentTimeMillis());
            }
        }, 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }


}
