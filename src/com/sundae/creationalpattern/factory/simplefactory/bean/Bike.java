package com.sundae.creationalpattern.factory.simplefactory.bean;

public class Bike extends Vehicle {
    @Override
    public Vehicle newInstance() {
        return new Bike();
    }
}
