package com.crazystone.test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by crazystone on 2016/3/11.
 */
public class LruMap {

    /**
     * map最大的size    **
     */
    private static final int MAX_SIZE = 6;
    //    private static final int DEFALUT_SIZE = 3;
    private int size = 0;
    private Map<String, Object> map = new LinkedHashMap<String, Object>();


    public LruMap() {

    }

//    public LruMap(int size) {
//        this.size = size;
//    }

    public void add(String str, Object obj) {
        if (size < 0) throw new IllegalStateException("size is negative");
        if (size <= MAX_SIZE) {
            if (map.containsKey(str)) {
//                Object preObj = map.remove(str);
//                map.put(str, obj);
                map.put(str, obj);
                size++;
            } else {
                map.put(str, obj);
                size++;
            }
        } else if (size > MAX_SIZE) {
            Object preObj = map.remove(str);
            map.put(str, obj);
        }

    }

//    public Object remove() {
//        if (size > MAX_SIZE) {
//            size
//        }
//
//        return null;
//    }

    public void print() {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.print("key:" + entry.getKey() + ",value:" + entry.getValue() + "   ");
        }
    }

    public int getSize() {
        if (map != null) return map.size();
        return 0;
    }

}
