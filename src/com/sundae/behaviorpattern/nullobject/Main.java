package com.sundae.behaviorpattern.nullobject;

/**
 * 空对象模式
 */
public class Main {
    public static void main(String[] args) {
        AbstractCustomer aaObject = CustomerFactory.getCustomer("AA");
        AbstractCustomer nullObject = CustomerFactory.getCustomer("DD");

        System.out.println(aaObject.getName());
        System.out.println(nullObject.getName());
    }
}
