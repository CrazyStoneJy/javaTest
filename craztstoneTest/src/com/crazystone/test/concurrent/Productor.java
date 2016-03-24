package com.crazystone.test.concurrent;

/**
 * 生产者线程
 * Created by crazystone on 2016/3/22.
 */
public class Productor implements Runnable {

    private Factory mFactory;

    public Productor(Factory factory) {
        this.mFactory = factory;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println("productor product " + i);
            mFactory.add(i++);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
