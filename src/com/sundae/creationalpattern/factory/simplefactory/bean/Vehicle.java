package com.sundae.creationalpattern.factory.simplefactory.bean;

public abstract class Vehicle {

    /**
     * @see com.sundae.creationalpattern.factory.simplefactory.ReflectInstanceFactory
     * @return
     */
    public abstract Vehicle newInstance();
}
