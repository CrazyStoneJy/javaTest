package com.crazystone.test.pattern.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by crazystone on 2016/3/25.
 */
public class ObservableTest {

    public static void main(String[] args) {

        //被观察者
        MyObservable observable = new MyObservable();
        //一号观察者
        MyObserver first = new FirstObserver(observable);
        //一号观察者解绑
        first.unbind(observable);
        //二号观察者
        MyObserver second = new SecondObserver(observable);

        observable.setData("大同", 19);

    }

}
