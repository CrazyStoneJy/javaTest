package com.crazystone.test;

import com.crazystone.datastructure.sort.SelectionSort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by crazystone on 2016/2/23.
 */
public class Test {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    static SimpleDateFormat selection_sdf = new SimpleDateFormat("yyyyMMdd");

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int temp = 0;
            do {
                temp = new Random().nextInt(10);
            } while (list.contains(temp));
            list.add(temp);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list = SelectionSort.sort(list);
        System.out.println("list:" + list.toString());


        System.out.println(offsetDate());

        System.out.println("OFFSET DATE:" + getCountByDateType(DateType.SEMSTER, new Date()));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(getDate("20160708"));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
    }


    //    public static int getRandomNumber(List<Integer> list) {
    //        int temp = 0;
    //        if (list == null || list.size() == 0) return -1;
    //
    //        temp = new Random().nextInt(10);
    //        if (list.contains(temp)) {
    //            getRandomNumber(list);
    //        }else{
    //            return temp;
    //        }
    //
    //        return temp;
    //    }

    public static int offsetDate() {

        int count = 0;
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("date1:" + format(date));
        calendar.add(Calendar.DATE, -6);
        Date afterDate = calendar.getTime();
        System.out.println("after date:" + format(afterDate));

        Date temp = afterDate;
        while (date.compareTo(temp) > 0) {
            count++;
            calendar.add(Calendar.DATE, +1);
            temp = calendar.getTime();
        }
        return count;
    }


    public static String format(Date date) {

        return sdf.format(date);
    }


    public static int getCountByDateType(DateType type, Date date) {
        int count = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (type == DateType.MONTH) calendar.add(Calendar.MONTH, -1);
        if (type == DateType.SEMSTER) calendar.add(Calendar.MONTH, -3);
        if (type == DateType.HALF_YEAR) calendar.add(Calendar.MONTH, -6);
        if (type == DateType.YEAR) calendar.add(Calendar.YEAR, -12);

        Date endDate = calendar.getTime();
        while (date.compareTo(endDate) > 0) {
            count++;
            calendar.add(Calendar.DATE, +1);
            endDate = calendar.getTime();
        }
        return count;
    }

    public static String getDate(String dateStr) {
        String str = "";
        try {
            Date sDate = selection_sdf.parse(dateStr);
            str = sdf.format(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str;
    }


}

