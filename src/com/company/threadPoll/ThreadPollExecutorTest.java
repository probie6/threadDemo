package com.company.threadPoll;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPollExecutorTest {
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(5,8,200, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));

        for(int i = 0; i<15; i++) {
            Task task = new Task(i);
            threadPoolExecutor.execute(task);
            System.out.println("线程池中数目："+threadPoolExecutor.getPoolSize()+
                    ",队里中等待执行的任务数目:"+threadPoolExecutor.getQueue().size()+
                    ",已执行完别的任务数目:"+threadPoolExecutor.getCompletedTaskCount());
        }
        threadPoolExecutor.shutdown();



    }
}
