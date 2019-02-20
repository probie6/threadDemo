package com.company.thread;

public class Person {

    public double salary = 1000;

     public void increase() {

             System.out.println(Thread.currentThread()+":"+"取之前:"+salary);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             if(salary >= 0)
                 salary = salary - 100;
             System.out.println(Thread.currentThread()+":"+"取之后:"+salary);



    }
}
