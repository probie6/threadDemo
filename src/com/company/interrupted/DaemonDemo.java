package com.company.interrupted;

/**
 * Daemon（true）：表示将线程设置为守护线程，
 * 守护线程和非守护线程区别：当所有非守护线程运行完后，即使还有守护线程没运行完，jvm将停止工作
 * 守护线程：垃圾回收线程.......
 */
public class DaemonDemo {
    public static void main(String[] args) throws Exception {
        //test1();
        test2();


    }

    //thread为非守护线程，当主线程输出 main is over运行结束后，thread线程会一直运行
    public static void test1() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    //System.out.println("is running！");
                }
            }
        });

        thread.start();
        System.out.println("main is over");
    }

    //thread为守护线程，当主线程输出 main is over运行结束后，jvm会停止工作，thread线程也会终止
    public static void test2() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    //System.out.println("is running！");
                }
            }
        });

        //设置守护线程必须在start()，否则会报错
        thread.setDaemon(true);
        thread.start();

        System.out.println("main is over");
    }
}
