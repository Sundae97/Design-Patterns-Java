package com.sundae.creationalpattern.factory.abstractfactory.bean;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green ---> fill");
    }
}
