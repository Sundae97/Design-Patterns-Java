package com.sundae.creationalpattern.factory.simplefactory;

import com.sundae.creationalpattern.factory.simplefactory.bean.Bike;
import com.sundae.creationalpattern.factory.simplefactory.bean.Car;
import com.sundae.creationalpattern.factory.simplefactory.bean.Truck;
import com.sundae.creationalpattern.factory.simplefactory.bean.Vehicle;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂模式 ---> 使用反射机制进行类注册的简单工厂模式
 */
public class ReflectFactory {

    private Map<String, Class> registeredProducts = new HashMap<>();

    public void registerVehicle(String vehicleId, Class vehicleClass){
        registeredProducts.put(vehicleId, vehicleClass);
    }

    public Vehicle create(String type) throws IllegalAccessException, InstantiationException {
        Class productClass = registeredProducts.get(type);
        return (Vehicle) productClass.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ReflectFactory reflectFactory = new ReflectFactory();
        reflectFactory.registerVehicle("car", Car.class);
        reflectFactory.registerVehicle("bike", Bike.class);
        reflectFactory.registerVehicle("truck", Truck.class);

        Vehicle vehicle = reflectFactory.create("car");
    }

}

