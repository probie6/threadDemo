package com.company.thread;

public class MySecondThread implements Runnable{
    private Person person;
    @Override
    public void run() {
        while (person.salary >= 0) {
            person.increase();
        }
    }

    public MySecondThread(Person person) {
        this.person = person;
    }
}
