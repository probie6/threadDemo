package com.company.instanceLock;

public class Teacher {

    public static synchronized void teach() throws InterruptedException {
        System.out.println("老师正在上课");
        Thread.sleep(2000);
    }

    public  void eat() throws InterruptedException {
        synchronized (Teacher.class) {
            System.out.println("老师正在吃饭");
            Thread.sleep(2000);
        }

    }
}
