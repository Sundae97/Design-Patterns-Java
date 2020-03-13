package com.sundae.behaviorpattern.nullobject;

/**
 * 对象创建工厂
 */
public class CustomerFactory {
    public static final String[] names = {"AA", "BB", "CC"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < name.length(); i++) {
            if(names[i].equalsIgnoreCase(name))
                return new RealCustomer(name);
        }
        return new NullCustomer();
    }
}
