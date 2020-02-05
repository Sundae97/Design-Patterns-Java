package com.sundae.behaviorpattern.observer;

/**
 * 观察者C
 */
public class CObserver extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(CObserver.class.getName() + " ---> " + msg);
    }
}
