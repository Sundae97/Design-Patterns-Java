package com.sundae.creationalpattern.factory.simplefactory.bean;

public class Car extends Vehicle {
    @Override
    public Vehicle newInstance() {
        return new Car();
    }
}
