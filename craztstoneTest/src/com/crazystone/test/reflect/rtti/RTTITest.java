package com.crazystone.test.reflect.rtti;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by e on 2016/4/26.
 */
public class RTTITest {
    public static void main(String[] agrs) {
        List<Shape> list = new ArrayList<Shape>();
        list.add(new Circle());
        list.add(new Square());
        list.add(new Shape());

        for (Shape shape : list) {
           print(shape.getClass());
        }
    }


    public static void print(Class<? extends Shape> cls) {
        StringBuilder sb = new StringBuilder();
        String className = cls.getName();
        sb.append(className).append(" is Interface :"+cls.isInterface());
        System.out.println(sb.toString());
    }
}
