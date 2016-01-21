package com.crazystone.test.enumtest;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.TimeZone;

public class MyEnumTest {

    public static void main(String[] args) throws ParseException {

        MyType[] types = MyType.values();
        for (MyType type : types) {
            System.out.println("enum name:" + type.name());
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        int testNumber = 5;
        boolean isF = (testNumber == MyType.THIRD.number) ? true : false;
        System.out.println(isF);
        System.out.println("enum third values:" + MyType.FIRST.number);
        MyType.test();
        System.out.println("acquire first value:" + MyType.FIRST.getMyNumber(5423));

        EnumSet<MyType> sets = EnumSet.allOf(MyType.class);
        for (MyType type : sets) {
            System.out.println("type name:" + type + ",number:" + type.number + ",value:" + type.name());
        }

//		Wed, 20 Jan 2016 09:39:31 GMT
//        Wed, 4 Jul 2001 12:08:56 -0700<
        System.out.println(">>>>>>>>>>>>>>>>>>>>>日期转换");
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.ENGLISH);
        System.out.println(sdf.format(new Date()));
        String str = "Wed, 20 Jan 2016 09:39:31 GMT";
        Date date = sdf.parse(str);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(sdf1.format(date));


    }


}
