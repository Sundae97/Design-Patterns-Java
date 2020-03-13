package com.sundae.behaviorpattern.template;

/**
 * 模板实现类
 */
public class Man extends People {
    @Override
    protected void eat() {
        System.out.println("man eat");
    }

    @Override
    protected void work() {
        System.out.println("man work");
    }

    @Override
    protected void sleep() {
        System.out.println("man sleep");
    }
}
