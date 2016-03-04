package com.crazystone.test.pattern.strategy.after;

/**
 * Created by crazystone on 2016/1/20.
 */
public class BloodAttack implements IAttack {
    @Override
    public void attack() {
        System.out.println("嗜血鬼帐");
    }
}
