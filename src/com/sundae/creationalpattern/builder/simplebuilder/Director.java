package com.sundae.creationalpattern.builder.simplebuilder;

/**
 * 导演类
 */
public class Director {
    private Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board, String display) {
        builder.buildDisplay(display);
        builder.buildBoard(board);
        builder.buildOs();
    }
}
