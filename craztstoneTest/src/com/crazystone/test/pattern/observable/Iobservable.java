package com.crazystone.test.pattern.observable;

/**
 * 被观察者
 * 被观察者拥有的能力：
 * 1：能够管理观察者，即（可以增加和移除观察者）
 * 2：当自身数据发生改变时能够通知观察者
 * Created by crazystone on 2016/3/25.
 */
public interface Iobservable {

    void addObserver(Iobserver observer);

    void reomveObserver(Iobserver observer);

    void notifyObserver();

}
