package com.sundae.creationalpattern.builder.simplebuilder;

import com.sundae.creationalpattern.builder.simplebuilder.bean.Computer;

/**
 * 抽象建造者类
 */
public abstract class Builder {
    abstract void buildBoard(String board);
    abstract void buildDisplay(String display);
    abstract void buildOs();
    abstract Computer build();
}
