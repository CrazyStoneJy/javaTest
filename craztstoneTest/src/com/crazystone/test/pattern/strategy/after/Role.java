package com.crazystone.test.pattern.strategy.after;

/**
 * 将功能分割
 * Created by crazystone on 2016/1/20.
 */
public abstract class Role {

    protected IRun iRun;
    protected IAttack iAttack;
    protected IDefense iDefense;

    protected abstract void name();

    protected void attack() {
        iAttack.attack();
    }

    protected void defense() {
        iDefense.defense();
    }

    protected void run() {
        iRun.run();
    }


    public Role setiAttack(IAttack iAttack) {
        this.iAttack = iAttack;
        return this;
    }


    public Role setiRun(IRun iRun) {
        this.iRun = iRun;
        return this;
    }


    public Role setiDefense(IDefense iDefense) {
        this.iDefense = iDefense;
        return this;
    }
}
