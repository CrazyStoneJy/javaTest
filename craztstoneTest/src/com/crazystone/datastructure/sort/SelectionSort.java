package com.crazystone.datastructure.sort;

import java.util.List;

/**
 * 选择排序
 * Created by crazystone on 2016/2/23.
 */
public class SelectionSort {

    //fixme(has problem)
    public static List<Integer> sort(List<Integer> list) {
        //下标值
        int min = 0;
        int temp = 0;//中间存储变量
        for (int i = 0; i < list.size(); i++) {
            min = i;
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(min) > list.get(j)) {
                    min = j;
                }
            }

            if (min != i) {
                temp = list.get(min);
                list.set(i, temp);
                list.set(min, list.get(i));
            }
        }


        return list;
    }


}
