package com.sundae.behaviorpattern.mediator;

/**
 * 中介者模式
 */
public class Main {
    public static void main(String[] args) {
        Client robert = new Client("Robert");
        Client john = new Client("John");
        Admin tom = new Admin("Tom");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
        tom.sendMessage("Welcome!");
    }
}
