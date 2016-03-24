package com.crazystone.test.reflect;

/**
 * Created by crazystone on 2016/3/17.
 */
public class ReflectTest {

    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println("isInstance:" + Animal.class.isInstance(dog));
        System.out.println("instance of:" + (dog instanceof Animal));
    }

}
