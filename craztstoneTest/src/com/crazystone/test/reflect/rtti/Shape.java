package com.crazystone.test.reflect.rtti;

/**
 * Created by e on 2016/4/26.
 */
public class Shape implements MyInterface1,MyInterface2 {

  public Shape(){

  }

    protected void draw(){
        System.out.print("shape draw method");
    }
}
