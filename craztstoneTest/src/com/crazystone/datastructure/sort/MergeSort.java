package com.crazystone.datastructure.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 归并排序(递归思想)
 * Created by crazystone on 2016/2/22.
 */
public class MergeSort {

    public static void sort(List<Integer> list, int start, int end) {

        if (list.size() > 1) {
            List<Integer> first = new ArrayList<Integer>();
            System.arraycopy(list, 0, first, list.size() / 2, list.size() / 2);
            List<Integer> second = new ArrayList<Integer>();
            System.arraycopy(list, list.size() / 2 + 1, second, 0, list.size());
            merge(first, second);
        }
    }


    /**
     * 归并
     *
     * @param first
     * @param second
     */
    public static List<Integer> merge(List<Integer> first, List<Integer> second) {

        int index1 = 0, index2 = 0, index3 = 0;
        List<Integer> after = new ArrayList<Integer>();
        while (index1 < first.size() || index2 < second.size()) {
            if (first.get(index1) < second.get(index2)) {
                after.set(index3, first.get(index1));
                index1++;
                index3++;
            } else {
                after.set(index3, second.get(index2));
                index2++;
                index3++;
            }

            
            while (index1 < first.size()) {
                after.set(index3, first.get(index1));
                index1++;
                index3++;
            }

            while (index2 < second.size()) {
                after.set(index3, second.get(index2));
                index2++;
                index3++;
            }
        }
        return after;
    }

}
