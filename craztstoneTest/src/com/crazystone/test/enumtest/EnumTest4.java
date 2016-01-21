package com.crazystone.test.enumtest;

/**
 * Created by crazystone on 2016/1/21.
 */
public class EnumTest4 {

    public static void main(String[] args){

        Enum4 second=Enum4.BANNER;

        for(int i=0;i<5;i++){
            System.out.println(second.next());
        }

    }

}
