package com.sundae.behaviorpattern.template;

/**
 * 模板实现类
 */
public class Woman extends People {
    @Override
    protected void eat() {
        System.out.println("woman eat");
    }

    @Override
    protected void work() {
        System.out.println("woman work");
    }

    @Override
    protected void sleep() {
        System.out.println("woman sleep");
    }
}
