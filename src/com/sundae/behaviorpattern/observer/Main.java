package com.sundae.behaviorpattern.observer;

/**
 * 观察者模式
 */
public class Main {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        subject.attach(new AObserver());
        subject.attach(new BObserver());
        subject.attach(new CObserver());
        subject.setMsg("update");
    }
}
