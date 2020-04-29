package com.test.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: ymy
 * @create: 2020/4/28
 */
public class SingleThreadPoolDemo {
    public static void main(String[] args) {
//        创建一个使用单个worker线程的Executor，以无界队列方式来运行该线程
//        （注意： 如果因为在关闭前的执行期间出现失败而终止了了单个线程，那么如果需要，一个新线程将代替它执行后续任务）
//        可保证顺序地执行各个任务，并且在任意给定的时间不会有多个线程是活动的。
//        特点:
//        1.线程池中最多一个线程，之后提交的线程活动将会排列在队列中等待执行

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0;i<20;i++){
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }
}
