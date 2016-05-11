package com.crazystone.test.pattern.decorator;

/**
 * Created by crazystone on 2016/5/11.
 */
public class Chilli implements ICost {

    private ICost cost;

    public Chilli(ICost cost) {
        this.cost = cost;
    }

    public Chilli(){}

    @Override
    public double price() {
        return 5+(cost!=null?cost.price():0);
    }
}
