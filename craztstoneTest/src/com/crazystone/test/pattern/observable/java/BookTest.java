package com.crazystone.test.pattern.observable.java;

import java.util.Calendar;

/**
 * Created by crazystone on 2016/3/25.
 */
public class BookTest {

    public static void main(String[] args) {
        Book book = new Book();
        Coder1 coder1 = new Coder1();
        Coder2 coder2 = new Coder2();
        //coder1订阅book
        book.addObserver(coder1);
        book.addObserver(coder2);
        book.updateBook("《bitch的传奇自传》");
    }
}
