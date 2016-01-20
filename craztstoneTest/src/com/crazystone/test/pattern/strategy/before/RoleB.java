package com.crazystone.test.pattern.strategy.before;

/**
 * Created by crazystone on 2016/1/20.
 */
public class RoleB extends Role {
    @Override
    protected void name() {
        System.out.println("B");
    }

    @Override
    protected void attack() {
        System.out.println("嗜血鬼帐");
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
