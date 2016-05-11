package com.crazystone.test.pattern.decorator;

/**
 * Created by crazystone on 2016/5/11.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        ICost chilli = new Chilli();
        ICost lettuce = new Lettuce();
        Hamburger chickenHamburger1 = new ChickenHamburger("鸡腿堡");
        System.out.println(chickenHamburger1.getName() + ",price:" + chickenHamburger1.price());
        Hamburger chickenHamburger2 = new ChickenHamburger(new Lettuce(), "生菜鸡腿堡");
        System.out.println(chickenHamburger2.getName() + ",price:" + chickenHamburger2.price());
        Hamburger chickenHamburger3 = new ChickenHamburger(new Lettuce(new Chilli()), "生菜辣椒鸡腿堡");
        System.out.println(chickenHamburger3.getName() + ",price:" + chickenHamburger3.price());

    }


}
