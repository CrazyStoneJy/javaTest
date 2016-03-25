package com.crazystone.test.pattern.observable.java;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by crazystone on 2016/3/25.
 */
public class Coder1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
       System.out.println("HI,Coder1,"+arg+"出版了，欢迎订阅");
    }
}
