package com.sundae.behaviorpattern.mediator;

/**
 * 同事角色类
 */
public class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Admin-" + name;
    }
}
