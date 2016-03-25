package com.crazystone.test.pattern.observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crazystone on 2016/3/25.
 */
public class MyObservable implements Iobservable {

    private List<Iobserver> mObservers = new ArrayList<Iobserver>();
    private String mCityName;
    private int mData;

    @Override
    public void addObserver(Iobserver observer) {
        if (mObservers != null) mObservers.add(observer);
    }

    @Override
    public void reomveObserver(Iobserver observer) {
        if (mObservers != null && mObservers.size() > 0) mObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if (mObservers != null && mObservers.size() > 0) {
            for (Iobserver iobserver : mObservers) {
                iobserver.show(mCityName, mData);
            }
        }
    }

    public void setData(String mCityName, int mData) {
        this.mCityName = mCityName;
        this.mData = mData;
        notifyObserver();
    }

}
