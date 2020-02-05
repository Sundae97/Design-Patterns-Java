package com.sundae.behaviorpattern.observer;

/**
 * 观察者B
 */
public class BObserver extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(BObserver.class.getName() + " ---> " + msg);
    }
}
