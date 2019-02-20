package com.company.instanceLock;

public class Teaching implements  Runnable{
    private Teacher teacher;

    public Teaching(Teacher teacher) {
        this.teacher = teacher;
    }
    @Override
    public void run() {
        try {
            teacher.teach();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
