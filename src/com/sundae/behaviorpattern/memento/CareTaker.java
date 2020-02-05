package com.sundae.behaviorpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者类
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
