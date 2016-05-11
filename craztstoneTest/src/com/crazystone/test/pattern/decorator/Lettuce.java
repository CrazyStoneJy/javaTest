package com.crazystone.test.pattern.decorator;

/**
 * Created by crazystone on 2016/5/11.
 */
public class Lettuce implements ICost {

    private ICost cost;

    public Lettuce(ICost cost) {
        this.cost = cost;
    }

    public Lettuce(){}

    @Override
    public double price() {
        return 10 + (cost != null ? cost.price() : 0);
    }
}
