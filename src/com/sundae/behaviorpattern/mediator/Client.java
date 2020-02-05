package com.sundae.behaviorpattern.mediator;

/**
 * 同事角色类
 */
public class Client extends User {
    public Client(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Client-" + name;
    }
}
