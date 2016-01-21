package com.crazystone.test.enumtest;

/**
 * Created by crazystone on 2016/1/21.
 */
public enum Enum7 {

    EAT(Enum6.FOOD.class),
    SLEEP(Enum6.JUCKFOOD.class);


    private Enum6[] values;

    private Enum7(Class<? extends Enum6> cls) {
        values = cls.getEnumConstants();
    }


    public Enum6 rand() {
        return EnumTest5.random(values);
    }
}
