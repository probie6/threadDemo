package com.company.threadPoll;

public class Task implements Runnable {
    private int taskNum;

    public Task(int num) {
        this.taskNum = num;
    }
    @Override
    public void run() {
        System.out.println("正在执行task:"+taskNum);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println(taskNum+"执行完毕!");

    }
}
