package com.crazystone.test.concurrent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产和消费工厂
 * Created by crazystone on 2016/3/22.
 */
public class Factory {

    private static final int MAX_SIZE = 2;
    private Queue<Integer> mList = new LinkedList<Integer>();
    private Lock mLock = new ReentrantLock();
    /*  非空的信号量    */
    private Condition mNotEmpty = mLock.newCondition();
    /*   非满的信号量  */
    private Condition mNotFill = mLock.newCondition();

    public void add(int value) {
        try {
            mLock.lock();
            while (mList.size() == MAX_SIZE) {
                System.out.println("Buffer is filled");
                mNotFill.await();
            }
            mList.offer(value);
            mNotEmpty.signal();
        } catch (Exception e) {

        } finally {
            mLock.unlock();
        }
    }

    public void sub() {
        mLock.lock();
        try {
            while (mList.isEmpty()) {
                System.out.println("Buffer is empty");
                mNotEmpty.await();
            }
            mList.remove();
            mNotFill.signal();
        } catch (Exception e) {

        } finally {
            mLock.unlock();
        }
    }

}
