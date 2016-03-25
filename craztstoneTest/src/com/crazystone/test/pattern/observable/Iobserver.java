package com.crazystone.test.pattern.observable;

/**
 * 观察者
 * 观察者功能：
 * 1：能够获取被观察者的更新的数据，并显示
 * Created by crazystone on 2016/3/25.
 */
public interface Iobserver {

    void show(String city, int data);

    void unbind(Iobservable iobservable);
}
