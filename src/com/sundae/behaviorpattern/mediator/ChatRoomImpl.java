package com.sundae.behaviorpattern.mediator;

import java.util.Date;

/**
 * 中介类
 */
public class ChatRoomImpl implements ChatRoom {
    public void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
