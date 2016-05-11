package com.crazystone.test.pattern.decorator;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.print.attribute.HashPrintRequestAttributeSet;
import java.util.logging.Handler;

/**
 * Created by crazystone on 2016/5/11.
 */
public abstract class Hamburger implements ICost {

    protected ICost mCost;
    protected String name;
    private static final double PRICE = 30;
    public static final String HAMBURGER = "汉堡包";

    public Hamburger() {
        this(null, null);
    }

    public Hamburger(String name) {
        this(name, null);
    }

    public Hamburger(String name, ICost cost) {
        this.name = name;
        this.mCost = cost;
    }

    public Hamburger(ICost cost) {
        this(null, cost);
    }

    @Override
    public double price() {
        double price = 30;
        return price + (mCost != null ? mCost.price() : 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
