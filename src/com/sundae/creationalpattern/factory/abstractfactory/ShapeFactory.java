package com.sundae.creationalpattern.factory.abstractfactory;

import com.sundae.creationalpattern.factory.abstractfactory.bean.Circle;
import com.sundae.creationalpattern.factory.abstractfactory.bean.Color;
import com.sundae.creationalpattern.factory.abstractfactory.bean.Rectangle;
import com.sundae.creationalpattern.factory.abstractfactory.bean.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null)
            return null;

        if (shape.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }
}
