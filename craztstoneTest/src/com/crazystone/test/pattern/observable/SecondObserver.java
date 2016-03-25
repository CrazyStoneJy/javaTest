package com.crazystone.test.pattern.observable;

/**
 * Created by crazystone on 2016/3/25.
 */
public class SecondObserver extends MyObserver {

    public SecondObserver(Iobservable iobservable) {
        iobservable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("SecondObserver>>>" + "city:" + city + ",data:" + data);
    }

}
