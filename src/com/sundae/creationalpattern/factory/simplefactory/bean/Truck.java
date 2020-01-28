package com.sundae.creationalpattern.factory.simplefactory.bean;

public class Truck extends Vehicle {
    @Override
    public Vehicle newInstance() {
        return new Truck();
    }
}
