package com.company.producerAndConsumer;

import java.util.Vector;

//生产
public class Producer implements Runnable{
    private Vector<Product> products = new Vector<Product>();

    public Producer(Vector<Product> products) {
        this.products = products;
    }
    @Override
    public void run() {

        while(true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (products) {
                if(products.size() >= 10) {
                    try {
                        System.out.println("====生产者进入等待=====");
                        products.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Product product = new Product("包子",System.currentTimeMillis());
                products.add(product);
                try {
                    System.out.println(Thread.currentThread().getName()+"生产了编号为："+product.getNumber()+"的产品,当前剩余"+products.size());
                    Thread.sleep(1000);
                    products.notify();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
