package com.company.producerAndConsumer;

import java.util.Vector;

public class Main {
    public static void main(String[] args) throws Exception {
        Vector<Product> products = new Vector<Product>();
        products.add(new Product("包子",System.currentTimeMillis()));

        Producer producer = new Producer(products);
        Thread t1 = new Thread(producer);

        Consumer consumer = new Consumer(products);
        Thread t2 = new Thread(consumer);

        t2.start();
        t1.start();


    }

}
