package com.crazystone.test.pattern.strategy.before;

/**
 * Created by crazystone on 2016/1/20.
 */
public class RoleC extends Role {
    @Override
    protected void name() {
        System.out.println("C");
    }

    @Override
    protected void attack() {
        System.out.println("月之刃");
    }

    @Override
    protected void defense() {
        System.out.print("月之盾");
    }

    @Override
    protected void run() {
        System.out.print("摩托");
    }
}
