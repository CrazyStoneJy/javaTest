package com.crazystone.test.dataStructure;

import java.util.StringTokenizer;

/**
 * Created by crazystone on 2016/3/30.
 */
public class StringTokenTest {

    public static void main(String[] agrs){

        String test="wo men dou shi zhong guo ren";
        StringTokenizer tokenizer=new StringTokenizer(test);

        System.out.println(Math.ceil((float) Math.log10(120d)));

        while(tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextElement());
        }
    }


}
