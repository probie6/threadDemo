package com.company.instanceLock;

public class Eatting implements Runnable{

    private Teacher teacher;

    public Eatting(Teacher teacher) {
        this.teacher = teacher;
    }
    @Override
    public void run() {
        try {
            teacher.eat();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
