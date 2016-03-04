package com.crazystone.test.enumtest;

import java.util.Random;

/**
 * Created by crazystone on 2016/1/21.
 */
public class EnumTest5 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(random(Eunm5.class));
        }

    }

    public static Random random = new Random();

    public static <T extends Enum<T>> T random(Class<T> cls) {
        return random((cls.getEnumConstants()));
    }


    public static <T> T random(T[] values) {
        return values[random.nextInt(values.length)];
    }

}
