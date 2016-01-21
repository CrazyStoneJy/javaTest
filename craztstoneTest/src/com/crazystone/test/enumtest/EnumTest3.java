package com.crazystone.test.enumtest;

/**
 * Created by crazystone on 2016/1/21.
 */
public class EnumTest3 {

    public static void main(String[] args) {

        Enum haha = Enum2.HAHA;

        Enum[] enums = haha.getClass().getEnumConstants();

        for (Enum e : enums) {
            System.out.println("name:" + e.name());
        }
    }

}
