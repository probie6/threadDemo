package com.company.instanceLock;

public class Main {
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher();
        Thread thread1 = new Thread(new Teaching(teacher));
        Thread thread2 = new Thread(new Eatting(teacher));

        thread1.start();
        thread2.start();

    }
}
