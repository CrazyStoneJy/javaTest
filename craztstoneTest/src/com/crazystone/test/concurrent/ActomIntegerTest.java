package com.crazystone.test.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by crazystone on 2016/3/22.
 */
public class ActomIntegerTest {

    public static void main(String[] args) {

        AtomicInteger integer = new AtomicInteger();

        int i = 0;
        do {
            i = integer.getAndIncrement();
            System.out.println("number:" + i);
        } while (i < 5);
    }


}
