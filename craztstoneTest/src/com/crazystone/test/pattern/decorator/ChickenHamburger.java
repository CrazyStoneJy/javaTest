package com.crazystone.test.pattern.decorator;

/**
 * Created by crazystone on 2016/5/11.
 */
public class ChickenHamburger extends Hamburger {

    public ChickenHamburger(ICost cost) {
        super(cost);
    }

    public ChickenHamburger(String name) {
        super(name);
    }

    public ChickenHamburger(ICost cost, String name) {
        super(name, cost);
    }

    public ChickenHamburger() {
        super();
    }

}
