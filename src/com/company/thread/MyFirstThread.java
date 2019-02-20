package com.company.thread;

public class MyFirstThread  implements Runnable{
    private Person person;
    @Override
    public void run() {
        while (person.salary >= 0) {
            person.increase();
        }
    }

    public MyFirstThread(Person person) {
        this.person = person;
    }
}
