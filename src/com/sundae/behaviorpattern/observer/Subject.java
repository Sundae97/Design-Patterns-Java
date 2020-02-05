package com.sundae.behaviorpattern.observer;

/**
 * 主题
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
}
