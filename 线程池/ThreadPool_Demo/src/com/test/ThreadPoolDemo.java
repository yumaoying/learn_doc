package com.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: ymy
 * @create: 2020/4/29
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(5));
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Math.random());
            }
        });
        threadPoolExecutor.shutdown();
    }
}
