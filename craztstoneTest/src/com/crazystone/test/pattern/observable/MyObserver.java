package com.crazystone.test.pattern.observable;

/**
 * Created by crazystone on 2016/3/25.
 */
public abstract class MyObserver implements Iobserver, IDisplay {

    protected String city;
    protected int data;

    @Override
    public void show(String city, int data) {
        this.city = city;
        this.data = data;
        display();
    }

    @Override
    public void display() {
        System.out.println("city:" + city + ",data:" + data);
    }

    @Override
    public void unbind(Iobservable iobservable) {
        iobservable.reomveObserver(this);
    }
}
