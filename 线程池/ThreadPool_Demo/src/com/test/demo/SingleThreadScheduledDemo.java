package com.test.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author: ymy
 * @create: 2020/4/29
 * 单个线程池
 */
public class SingleThreadScheduledDemo {

    public static void main(String[] args) {
//        创建一个单执行线程执行程序，它可安排在给定延迟后运行命令或定期地执行
//        特点:
//        1.线程池中最多执行1个线程，之后提交的线程活动将会排在队列中等待执行
//        2.可定时或延迟执行线程活动
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("1------延迟一秒执行，每三秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },1,3, TimeUnit.SECONDS);
    }
}
