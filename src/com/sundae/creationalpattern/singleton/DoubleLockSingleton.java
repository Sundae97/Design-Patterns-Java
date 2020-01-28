package com.sundae.creationalpattern.singleton;

/**
 * 拥有双重校验锁机制的同步锁单例模式
 */
public class DoubleLockSingleton {

    private static DoubleLockSingleton instance;

    public DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if(instance == null){
            synchronized (DoubleLockSingleton.class){
                if(instance == null)
                    instance = new DoubleLockSingleton();
            }
        }
        return instance;
    }

    //...

    public static void main(String[] args) {
        DoubleLockSingleton.getInstance();
    }
}
