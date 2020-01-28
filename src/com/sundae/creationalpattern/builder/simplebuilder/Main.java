package com.sundae.creationalpattern.builder.simplebuilder;

import com.sundae.creationalpattern.builder.simplebuilder.bean.Computer;

public class Main {
    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板", "Retina显示器");
        Computer computer = builder.build();
        System.out.println(computer.toString());
    }
}
