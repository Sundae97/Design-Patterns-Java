package com.sundae.creationalpattern.builder.chainbuilder;

public class ChainBuilder {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .mBoard("intel atx")
                .mDisplay("1920x1080")
                .build();
    }
}
