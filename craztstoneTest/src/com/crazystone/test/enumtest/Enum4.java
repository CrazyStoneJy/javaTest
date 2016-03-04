package com.crazystone.test.enumtest;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by crazystone on 2016/1/21.
 */
public enum Enum4 implements Serializable {

    APPLE,
    BANNER,
    PEAT,
    WATERMELON,
    LEMON;

    private Random random = new Random();

    public Enum4 next() {
        return values()[random.nextInt(values().length)];
    }


}
