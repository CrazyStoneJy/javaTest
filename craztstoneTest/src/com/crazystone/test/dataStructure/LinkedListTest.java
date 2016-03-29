package com.crazystone.test.dataStructure;

import com.crazystone.datastructure.list.List;
import com.crazystone.datastructure.list.MyLinkedList;

/**
 * Created by crazystone on 2016/3/28.
 */
public class LinkedListTest {

    public static void main(String[] args) {

        List<Integer> linkedList=new MyLinkedList<Integer>();

        linkedList.add(23);
        linkedList.add(45);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(9);
//        linkedList.remove(1);
System.out.println("index of:"+linkedList.indexOf(2));
System.out.println("last index of:"+linkedList.set(5,34));
//        linkedList.clear();


        System.out.println(linkedList.toString());


    }


}
