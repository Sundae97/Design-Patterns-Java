package com.sundae.creationalpattern.singleton;

/**
 * 无锁的线程安全单例模式
 */
public class LockFreeSingleton {

    private static final LockFreeSingleton instance = new LockFreeSingleton();

    public LockFreeSingleton() {
    }

    public static LockFreeSingleton getInstance() {
        return instance;
    }

    //...

    public static void main(String[] args) {
        LockFreeSingleton.getInstance();
    }
}
