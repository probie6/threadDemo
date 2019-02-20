package com.company.producerAndConsumer;

import java.util.Vector;

public class Consumer implements Runnable {
    private Vector<Product> products = new Vector<Product>();
    Object obj = new Object();

    public Consumer(Vector<Product> products) {
        this.products = products;
    }

    @Override
    public void run() {
        while(true) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (products) {
                if(products.size() <= 0) {
                    try {
                        System.out.println("====消费者进入等待=====");
                        products.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                try {

                    products.remove(0);
                    System.out.println(Thread.currentThread().getName()+"消费了1个产品,当前剩余:"+products.size());
                    Thread.sleep(1000);
                    products.notify();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public void test() throws InterruptedException {

        synchronized (obj) {
            System.out.println("test");
            Thread.sleep(5000);
        }
    }
}
