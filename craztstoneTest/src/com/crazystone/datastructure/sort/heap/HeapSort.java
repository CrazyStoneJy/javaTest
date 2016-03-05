package com.crazystone.datastructure.sort.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆排序
 * Created by crazystone on 2016/3/4.
 */
public class HeapSort<E extends Comparable> {

    public static <E extends Comparable> List<E> sort(E[] list) {
        BigHeap heap = new BigHeap(list);
        heap.printHeap();
        List<E> newList = new ArrayList<E>();
        for (int i = list.length - 1; i >= 0; i--) {
            list[i] = (E) heap.remove();
            newList.add(list[i]);
        }
        return newList;
    }

}
