package com.sundae.creationalpattern.factory.abstractfactory;

import com.sundae.creationalpattern.factory.abstractfactory.bean.Color;
import com.sundae.creationalpattern.factory.abstractfactory.bean.Green;
import com.sundae.creationalpattern.factory.abstractfactory.bean.Red;
import com.sundae.creationalpattern.factory.abstractfactory.bean.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null)
            return null;

        if (color.equalsIgnoreCase("RED"))
            return new Red();
        else if (color.equalsIgnoreCase("GREEN"))
            return new Green();

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
