package com.sundae.behaviorpattern.mediator;

/**
 * 抽象同事角色
 */
public abstract class User {
    protected String name;
    private ChatRoomImpl chatRoom = new ChatRoomImpl();

    public User(String name) {
        this.name = name;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        chatRoom.showMessage(this,message);
    }
}
