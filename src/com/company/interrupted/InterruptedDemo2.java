package com.company.interrupted;

/**
 * 如果线程调用sleep(),wait().notify(),notifyall()等方法，
 * 此时在调用interrupt()方法，会报错。
 *
 */

public class InterruptedDemo2 {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //while(true) {
                        //System.out.println(Thread.currentThread().isInterrupted());
                    //}
                        System.out.println("thread is sleeping");
                        Thread.sleep(2000000);
                        System.out.println("thread is awaking");

                } catch (Exception e) {
                    System.out.println("thread is Interrupted");
                }
            }
        });
        thread.start();

        Thread.sleep(1000);
        //强制thread线程中断
        thread.interrupt();
        System.out.println("1111:"+thread.isInterrupted());

        thread.join();
        System.out.println("main thrad is over");

    }
}
