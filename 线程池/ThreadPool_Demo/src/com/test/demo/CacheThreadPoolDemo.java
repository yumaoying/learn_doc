package com.test.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: ymy
 * @create: 2020/4/28
 * 缓存线程池
 */
public class CacheThreadPoolDemo {

    /**
     * newCachedThreadPool特点
     * 1.线程池中数量没有固定，可达到最大值 Integer.MAX_VALUE
     * 2.线程池中的线程可进行缓存重复利用并回收（回收时间默认为1分钟）
     * 3.当线程池中，没有可用线程，会创建一个线程
     */
    public static void main(String[] args) {
        /**
         * 创建了一个根据需要创建新线程的线程池,但是在以前构造的线程可用时会重用。并在需要时使用提供的ThreadFactory 创建新线程
         * 这些池通常会提高程序的性能,适用于短暂的异步任务执行（执行时间比较短的任务）。
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            //添加任务
            executorService.execute(new Task());
        }
        for (int i = 21; i < 35; i++) {
            System.out.println("===============");
            //添加任务
            executorService.execute(new Task());
        }


        executorService.shutdown();
    }
}
