package com.sundae.creationalpattern.singleton;

/**
 * 最普通的单例模式
 */
public class SimpleSingleton {

    private static SimpleSingleton instance;

    public SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if(instance == null)
            instance = new SimpleSingleton();
        return instance;
    }

    //...

    public static void main(String[] args) {
        SimpleSingleton.getInstance();
    }
}
