package com.crazystone.test.pattern.strategy.after;

/**
 * Created by crazystone on 2016/1/20.
 */
public class Test {

    public static void main(String[] args) {

        Role[] roles = new Role[3];
        roles[0] = new RoleA().setiAttack(new LunarAttack()).setiDefense(new LunarDefense()).setiRun(new QiLing());
        roles[1] = new RoleB().setiAttack(new BloodAttack()).setiDefense(new LunarDefense()).setiRun(new Moto());
        roles[2] = new RoleC().setiAttack(new LunarAttack()).setiDefense(new LunarDefense()).setiRun(new Moto());
        for (Role role : roles) {
            role.name();
            role.attack();
            role.defense();
            role.run();
            System.out.println(">>>>>>>>>>>>>>>>");
        }

    }


}
