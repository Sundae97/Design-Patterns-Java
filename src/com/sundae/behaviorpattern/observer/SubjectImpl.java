package com.sundae.behaviorpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 */
public class SubjectImpl implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void setMsg(String msg){
        notifyAll(msg);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        //TODO
    }

    private void notifyAll(String msg){
        for (Observer observer : observers)
            observer.update(msg);
    }
}
