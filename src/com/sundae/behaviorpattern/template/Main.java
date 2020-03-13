package com.sundae.behaviorpattern.template;

/**
 * 模板方法模式
 */
public class Main {
    public static void main(String[] args) {
        People man = new Man();
        man.toLive();

        People woman = new Woman();
        woman.toLive();
    }
}
