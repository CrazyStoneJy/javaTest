package com.crazystone.test.exception;

/**
 * Created by crazystone on 2016/3/23.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(cal(3, 0));

    }

    public static int cal(int a, int b) {
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e) {
            c = 1;
        }
        return c;
    }


}
