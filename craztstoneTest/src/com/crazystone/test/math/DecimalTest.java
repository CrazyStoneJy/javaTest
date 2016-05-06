package com.crazystone.test.math;

import java.text.DecimalFormat;

/**
 * Created by e on 2016/5/6.
 */
public class DecimalTest {

    /* 保留一位有效数字  */
    public static final DecimalFormat df1 = new DecimalFormat("###,###,###.0");
    public static void main(String[] args){
        System.out.println(getDecimalTwo(180f)+"%");
        System.out.println(getDecimalOne(01.5f)+"%");
    }

    /**
     * 保留两位有效数字
     *
     * @param number
     * @return
     */
    public static String getDecimalTwo(double number) {
        DecimalFormat format = new DecimalFormat("###,###.00");
        return format.format(number);
    }

    /**
     * 保留一位有效数字
     *
     * @param number
     * @return
     */
    public static String getDecimalOne(double number) {
        return df1.format(number);
    }
}
