package com.crazystone.test.fundation;

import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;
import com.sun.xml.internal.ws.util.ASCIIUtility;

/**
 * Created by crazystone on 2016/4/14.
 */
public class BitOpeartionTest {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        System.out.println("a:" + convertBinary(a) + ",b:" + convertBinary(b));
        int c = a >>> 1;
        System.out.println(a + "无符号左移：" + convertBinary(c));
        System.out.println(a + "&" + b + ":" + convertBinary(a & b));
        System.out.println(a + "|" + b + ":" + convertBinary(a | b));
        System.out.println(a + "^" + b + ":" + convertBinary(a ^ b));

//        System.out.println(a + "符号非：" + convertBinary(~a));

    }

    /**
     * 将十进制转为二进制
     *
     * @param number
     * @return
     */
    public static String convertBinary(int number) {
        StringBuilder sb = new StringBuilder();
        int num = number;
        if (num == 0) return "0";
        while (num > 0) {
            if (num % 2 == 0) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            num = num / 2;
        }


        return sb.reverse().toString();
    }


}
