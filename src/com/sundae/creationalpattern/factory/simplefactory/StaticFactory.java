package com.sundae.creationalpattern.factory.simplefactory;

import com.sundae.creationalpattern.factory.simplefactory.bean.*;

/**
 * 简单工厂模式 ---> 静态工厂模式
 */
public class StaticFactory {

    public enum VehicleType {
        Car, Bike, Truck
    }

    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.Car))
            return new Car();
        else if (type.equals(VehicleType.Bike))
            return new Bike();
        else if (type.equals(VehicleType.Truck))
            return new Truck();
        else
            return null;
    }

    public static void main(String[] args) {
        Vehicle vehicle = StaticFactory.create(VehicleType.Bike);
    }

}
