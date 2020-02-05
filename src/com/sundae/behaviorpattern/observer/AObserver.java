package com.sundae.behaviorpattern.observer;

/**
 * 观察者A
 */
public class AObserver extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(AObserver.class.getName() + " ---> " + msg);
    }
}
