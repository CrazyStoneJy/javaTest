package com.crazystone.datastructure.sort;

import java.util.List;

/**
 * 冒泡算法
 * Created by crazystone on 2016/2/22.
 */
public class BubbleSort {

    public static List<Integer> sort(List<Integer> list) {
        if (list == null || list.size() == 0) throw new RuntimeException("list is null or list size is zero");
        int temp = 0;
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        return list;
    }

    /**
     * 优化后的冒泡算法
     *
     * @param list
     * @return
     */
    public static List<Integer> optimSort(List<Integer> list) {
        int temp = 0;
        boolean isPass = true;
        if (list == null || list.size() == 0) throw new RuntimeException("list is null or list size is zero");
        for (int i = 1; i < list.size() && isPass; i++) {
            isPass = false;
            for (int j = 0; j < list.size() - i; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    isPass = true;
                }
            }
        }
        return list;
    }
}
