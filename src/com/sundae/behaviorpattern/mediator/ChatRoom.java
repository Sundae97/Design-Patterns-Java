package com.sundae.behaviorpattern.mediator;

/**
 * 抽象中介者
 */
public interface ChatRoom {
    void showMessage(User user, String message);
}
