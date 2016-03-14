package com.crazystone.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by crazystone on 2016/3/14.
 */
public class VolatileTest {

    static Countter countter;

    public static void main(String[] args) {
        validate();
    }

    public static void validate() {
        int pool = Runtime.getRuntime().availableProcessors() * 2;
        System.out.println("pool size:" + pool);
        ExecutorService service = Executors.newFixedThreadPool(pool);
        countter = new Countter();
        service.execute(new IncreaseRunnable());
        service.execute(new DecreaseRunnable());
        service.shutdown();
    }

    public static class IncreaseRunnable implements Runnable {

        @Override
        public void run() {
            countter.increase();
        }
    }

    public static class DecreaseRunnable implements Runnable {
        @Override
        public void run() {
            countter.decrease();
        }
    }

    public static class Countter {

        volatile int count = 0;

        public void increase() {
            try {
                Thread.sleep(500);
                count++;
                System.out.println("increase count:" + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void decrease() {
            count--;
            System.out.println("decrease count:" + count);
        }


        public int getValue() {
            return count;
        }
    }


}
