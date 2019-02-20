package com.company.threadLocal;

/**
 * 每个线程有一个threadLocals变量
 * ThreadLocal类的set()方法会给当前线程的threadLocals赋值
 * 总结：ThreadLocal类的set()不是给ThreadLocal的实例赋值，而是给当前调用set()方法的线程里的threadLocals变量赋值
 */
public class ThreadLocalTest {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    public static void main(String[] args) throws Exception {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("hello");
                print("one");
                System.out.println("one:"+threadLocal.get());

            }
        });
        one.start();

        System.out.println("main:"+threadLocal.get());
    }


    private static void print(String name) {
        System.out.println(name+":"+threadLocal.get());
        //threadLocal.remove();
    }

}
