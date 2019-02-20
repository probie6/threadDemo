package com.company.thread;

import com.company.thread.MyFirstThread;
import com.company.thread.MySecondThread;
import com.company.thread.Person;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        MyFirstThread myFirstThread = new MyFirstThread(person1);
        Thread thread1 = new Thread(myFirstThread);
        thread1.start();

        MySecondThread mySecondThread = new MySecondThread(person2);
        Thread thread2 = new Thread(mySecondThread);
        thread2.start();


    }
}
