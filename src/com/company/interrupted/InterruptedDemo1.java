package com.company.interrupted;

/**
 * interrupt()方法会将调用这个方法的线程标记中断状态
 * 因此thread线程里while循环里会变成false，从而使主线程运行最后一句话
 * join()方法：表示只有等调用该方法的线程运行结束，才会继续走下一句代码。
 */
public class InterruptedDemo1 {
    public static void main(String[] args) throws Exception {
        //子线程
         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
               while(!Thread.currentThread().isInterrupted()) {
                   System.out.println("hello");
               }
            }
        });

         thread.start();
         Thread.sleep(1000);
         //中断子线程
         thread.interrupt();
         //join()：表示子线程运行完才执行下面的代码,此时主线程阻塞
         thread.join();
         System.out.println("main thread is over");

    }
}
