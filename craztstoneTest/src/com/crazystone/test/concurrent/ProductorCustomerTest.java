package com.crazystone.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by crazystone on 2016/3/22.
 */
public class ProductorCustomerTest {

    public static void main(String[] agrs) {
        Factory factory = new Factory();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Productor(factory));
        executorService.execute(new Customer(factory));
        executorService.shutdown();
    }

}
