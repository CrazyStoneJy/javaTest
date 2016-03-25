package com.crazystone.test.pattern.observable.java;

import java.util.Observable;

/**
 * Created by crazystone on 2016/3/25.
 */
public class Book extends Observable {

    public void updateBook(String bookName) {
        setChanged();
        notifyObservers(bookName);
    }

}
