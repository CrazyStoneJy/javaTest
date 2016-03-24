package com.crazystone.test.concurrent;

/**
 * 消费者线程
 * Created by crazystone on 2016/3/22.
 */
public class Customer implements Runnable {

    private Factory mFactoty;

    public Customer(Factory factory) {
        this.mFactoty = factory;
    }

    @Override
    public void run() {

        while (true) {
            mFactoty.sub();
            System.out.println("customer custom one");
            try {
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
