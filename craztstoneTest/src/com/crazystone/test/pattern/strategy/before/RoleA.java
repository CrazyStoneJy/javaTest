package com.crazystone.test.pattern.strategy.before;

/**
 * Created by crazystone on 2016/1/20.
 */
public class RoleA extends Role {
    @Override
    protected void name() {
        System.out.println("A");
    }

    @Override
    protected void attack() {
        System.out.println("月之刃");
    }

    @Override
    protected void defense() {
        System.out.println("月之盾");
    }

    @Override
    protected void run() {
        System.out.println("麒麟");
    }
}
