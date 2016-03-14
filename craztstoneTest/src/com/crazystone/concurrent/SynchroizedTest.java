package com.crazystone.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by crazystone on 2016/3/14.
 */
public class SynchroizedTest {

    static Countter2 countter;

    public static void main(String[] args) {
        validate();
    }

    public static void validate() {
        int pool = Runtime.getRuntime().availableProcessors() * 2;
        System.out.println("pool size:" + pool);
        ExecutorService service = Executors.newFixedThreadPool(pool);
        countter = new Countter2();
        service.execute(new IncreaseRunnable2());
        service.execute(new DecreaseRunnable2());
        service.shutdown();
    }

    public static class IncreaseRunnable2 implements Runnable {

        @Override
        public void run() {
            countter.increase();
        }
    }

    public static class DecreaseRunnable2 implements Runnable {
        @Override
        public void run() {
            countter.decrease();
        }
    }

    public static class Countter2 {

        int count = 0;

        public synchronized void increase() {
            try {
                Thread.sleep(500);
                count++;
                System.out.println("increase count:" + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public synchronized void decrease() {
            count--;
            System.out.println("decrease count:" + count);
        }


        public int getValue() {
            return count;
        }
    }

}
