package com.crazystone.test.pattern.strategy.after;

/**
 * Created by crazystone on 2016/1/20.
 */
public class LunarAttack implements IAttack {
    @Override
    public void attack() {
        System.out.println("月之刃");
    }
}
