package com.company;

/**
 * 测试并发快还是串行执行快
 * @author  wangfei
 * data 2018-11-16
 */
public class Test {
    private static final long count = 200000000;

    private static void concurrency() {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for(int i = 0; i<count; i++) {
                    a++;
                }
            }
        });

        int b = (int) count;
        for(int i = 0; i<count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;

        System.out.println("循环"+count+"次,并发耗时"+time);

    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for(int i = 0; i<count; i++) {
            a++;
        }
        int b = (int) count;
        for(int i = 0; i<count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;

        System.out.println("循环"+count+"次,串行执行耗时"+time);

    }

    public static void main(String[] args) throws Exception {
        //并发
        //concurrency();
        //串行
        //serial();

    }
}
