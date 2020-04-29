package com.test.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: ymy
 * @create: 2020/4/28
 * 固定线程数线程池
 */
public class FixedThreadPoolDemo {


    public static void main(String[] args) {
        /**
         * 创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。在任意点，在大多数nThread 线程
         * 会处于处理任务的活动状态。如果在所有的线程处于活动状态时提交附加任务，在有可用线程之前，附加任务将在队列中等待。
         * 如果在关闭前的执行期间由于失败而导致任何线程终止，那么一个新线程将代替它执行后续的任务。在某个线程被显示关闭之前，池中的线程将一直存在
         * 1.线程池中的线程处于一定的量，可以很好的控制线程的并发量
         * 2.线程可以重复被使用，在显示关闭之前，将一直存在
         * 3.超出一定量的线程被提交时需要在队列中等待
         */
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            //添加任务
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }
}
