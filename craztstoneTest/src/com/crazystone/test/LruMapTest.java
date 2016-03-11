package com.crazystone.test;

import java.util.Random;

/**
 * Created by crazystone on 2016/3/11.
 */
public class LruMapTest {

    public static void main(String[] args) {

        LruMap map = new LruMap();

        System.out.println(new Random().nextInt(5));
        for (int i = 0; i < 5; i++) {
            map.add(String.valueOf(new Random().nextInt(3)), (i % 2 == 0 ? "haha" : "hehe"));
        }

        map.print();
    }


}
