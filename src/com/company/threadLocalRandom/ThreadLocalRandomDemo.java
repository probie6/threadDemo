package com.company.threadLocalRandom;

/**
 * ThreadLocalRandomDemo：该类主要解决Random类在多线程情况下性能问题 注：Random类在多线程情况下
 * 会出现多线程争抢种子的问题，拿到种子后根据种子计算新的值
 * ThreadLocalRandomDemo会让每个线程在内部维护一个种子变量，在获取随机数的时候使用的就是自己线程里面的种子值。
 * 该原理类似ThreadLocal类
 */
public class ThreadLocalRandomDemo {
}
