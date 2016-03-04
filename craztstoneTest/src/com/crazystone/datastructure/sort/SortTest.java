package com.crazystone.datastructure.sort;

import com.crazystone.datastructure.sort.heap.HeapSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by crazystone on 2016/3/4.
 */
public class SortTest {

    public static void main(String[] agrs) {

//        List<Integer> list = new ArrayList<Integer>();
        Integer[] array = new Integer[10];
        for (int i = 0; i < 10; i++) {
//            list.add(getRandomNumber());
            array[i] = getRandomNumber();
            System.out.print(array[i]+" ");
        }
        HeapSort.sort(array);
       System.out.println("");
       System.out.println(">>>>>>>>>>");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+" ");
        }
    }


    public static int getRandomNumber() {
        return new Random().nextInt(100);
    }

}
