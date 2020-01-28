package com.sundae.creationalpattern.factory.abstractfactory;

import com.sundae.creationalpattern.factory.abstractfactory.bean.Color;
import com.sundae.creationalpattern.factory.abstractfactory.bean.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

    public static void main(String[] args) {

    }
}
