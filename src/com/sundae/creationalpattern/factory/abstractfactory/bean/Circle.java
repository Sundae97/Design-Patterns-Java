package com.sundae.creationalpattern.factory.abstractfactory.bean;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle --> draw");
    }
}
