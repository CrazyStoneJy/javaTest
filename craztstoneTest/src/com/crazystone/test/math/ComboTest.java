package com.crazystone.test.math;

/**
 * Created by e on 2016/5/5.
 */
public class ComboTest {

    public static void main(String[] args) {

        System.out.println(f(10));

    }

    public static int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f(n - 1) + f(n - 2);
    }

}
