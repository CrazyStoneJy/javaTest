package com.crazystone.test.enumtest;

/**
 * Created by crazystone on 2016/1/21.
 */
public class EnumTest1 {

    public static void main(String[] args) {

        MyEnum1[] enums = MyEnum1.values();
//        boolean isEnd = true;
        int count = 0;
        for (MyEnum1 obj : enums) {

            System.out.println(obj.compareTo(MyEnum1.PFL));
            System.out.println(obj.ordinal());  //获取enum的position
            System.out.println(obj.compareTo(MyEnum1.PFL));
            System.out.println(obj.equals(MyEnum1.PFL));
            System.out.println(obj.name());
            System.out.println(obj.getDeclaringClass());
            count++;
            if (count != enums.length) System.out.println(">>>>>>>>>>");
        }
//            isEnd = true;
    }

}

