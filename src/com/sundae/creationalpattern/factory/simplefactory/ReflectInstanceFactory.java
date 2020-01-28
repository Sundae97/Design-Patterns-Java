package com.sundae.creationalpattern.factory.simplefactory;

import com.sundae.creationalpattern.factory.simplefactory.bean.Bike;
import com.sundae.creationalpattern.factory.simplefactory.bean.Car;
import com.sundae.creationalpattern.factory.simplefactory.bean.Truck;
import com.sundae.creationalpattern.factory.simplefactory.bean.Vehicle;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂模式 ---> 使用newInstance方法进行类注册的简单工厂模式
 */
public class ReflectInstanceFactory {
    private Map<String, Vehicle> registeredProducts = new HashMap<>();

    public void registerVehicle(String vehicleId, Vehicle vehicle) {
        registeredProducts.put(vehicleId, vehicle);
    }

    public Vehicle create(String type) {
        return registeredProducts.get(type).newInstance();
    }

    public static void main(String[] args) {
        ReflectInstanceFactory reflectFactory = new ReflectInstanceFactory();
        reflectFactory.registerVehicle("car", new Car());
        reflectFactory.registerVehicle("bike", new Bike());
        reflectFactory.registerVehicle("truck", new Truck());

        Vehicle vehicle = reflectFactory.create("car");
    }
}
