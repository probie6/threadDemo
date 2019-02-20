package com.company.createThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的第三种方式
 * 与其余两种比对优势为有返回值
 */
public class CallerTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "hello";
    }

    public static void main(String[] args) throws Exception {
        FutureTask<String> futureTask = new FutureTask<String>(new CallerTask());
        Thread thread = new Thread(futureTask);
        thread.start();
        String result = futureTask.get();
        System.out.println(result);

    }
}
