package com.crazystone.datastructure.sort;

import com.crazystone.datastructure.sort.heap.HeapSort;

import java.util.*;

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
            System.out.print(array[i] + " ");
        }
        List<Integer> list = HeapSort.sort(array);
        System.out.println("");
        System.out.println(">>>>>>>>>>");
//        for (int i = 0; i < 10; i++) {
        System.out.println(list.toString() + " ");
//        }

        Integer[] before = getArray();
        printArray(before);
        Integer[] after = InsertionSort.sort(before);
        printArray(after);

    }

    /**
     * 获取一个（0~100）整型的随机数
     *
     * @return
     */
    public static int getRandomNumber() {
        return new Random().nextInt(100);
    }

    /**
     * 生成一个整型的随机数组
     *
     * @return
     */
    public static Integer[] getArray() {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber();
        }
        return array;
    }


    /**
     * 打印数组
     *
     * @param array 数组
     * @param <E>   extends Comparable
     */
    public static <E extends Comparable> void printArray(E[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

}
