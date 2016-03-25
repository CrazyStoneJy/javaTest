package com.crazystone.test.pattern.observable;

/**
 * Created by crazystone on 2016/3/25.
 */
public class FirstObserver extends MyObserver {

    public FirstObserver(Iobservable iobservable) {
        iobservable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("FirstObserver>>>"+"city:" + city + ",data:" + data);
    }
}
