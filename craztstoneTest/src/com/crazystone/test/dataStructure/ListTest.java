package com.crazystone.test.dataStructure;

import com.crazystone.datastructure.list.List;
import com.crazystone.datastructure.list.MyArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by crazystone on 2016/3/28.
 */
public class ListTest {

    private int myId;

    public static void main(String[] args) {
        List<Integer> list = new MyArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
        list.add(2);
        list.add(1, 4);
        list.add(2, 6);
        list.clear();
//        list.remove(0);
//        list.remove(new Integer(4));
        System.out.println("last index of:" + list.lastIndexOf(2));
        System.out.println("index:" + list.indexOf(3));
        System.out.println("index:" + list.indexOf(2));
        System.out.println("constains 4:" + list.contains(4));
        System.out.println(list.toString());

//        ArrayList

//                LinkedList

    }


    private static class Test {
        int id;

        Test(int id) {
            this.id = id;
        }
    }


    private static void test() {


    }

}
