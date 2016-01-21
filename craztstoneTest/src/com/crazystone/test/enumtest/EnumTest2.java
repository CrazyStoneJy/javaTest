package com.crazystone.test.enumtest;

import sun.misc.OSEnvironment;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by crazystone on 2016/1/21.
 */
public class EnumTest2 {

    public static void main(String[] args) {

        Set<String> set1 = anlyisClass(Enum2.class);
        Set<String> set2 = anlyisClass(Enum.class);

        System.out.println("before:" + set1.size());

        set1.removeAll(set2);

        System.out.println("after:" + set1.size());
        for (String methodName : set1) {
            System.out.println("add method:" + methodName);
        }

    }

    public static Set<String> anlyisClass(Class<?> cls) {

//        System.out.println("class name:"+cls.);

        Set<String> sortSet = new LinkedHashSet<String>();

        StringBuilder sb = new StringBuilder();

        for (Type type : cls.getGenericInterfaces()) {
            sb.append(type + "\t");
        }
        System.out.println("interface:" + sb.toString());

        System.out.println("super class:" + cls.getGenericSuperclass());

        if (sb != null && sb.toString().trim().length() > 0) {
            sb.delete(0, sb.toString().trim().length() - 1);
        }

        for (Method method : cls.getMethods()) {
            String methodName = method.getName();
            sb.append(methodName + "\t");
            sortSet.add(methodName);
        }
        System.out.println("method:" + sb.toString());
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        return sortSet;
    }


}
