package com.sundae.creationalpattern.factory.factorymethod;

interface People {
    void say();
}

class Man implements People{
    @Override
    public void say() {
        System.out.println("Man");
    }
}

class Woman implements People{
    @Override
    public void say() {
        System.out.println("Woman");
    }
}

abstract class PeopleFactory{
    public abstract People create();
}

class ManFactory extends PeopleFactory{
    @Override
    public People create() {
        return new Man();
    }
}

class WomanFactory extends PeopleFactory{
    @Override
    public People create() {
        return new Woman();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        PeopleFactory manFactory = new ManFactory();
        People people = manFactory.create();
        people.say();
    }
}


