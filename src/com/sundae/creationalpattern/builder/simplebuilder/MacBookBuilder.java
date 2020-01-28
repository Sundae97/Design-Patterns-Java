package com.sundae.creationalpattern.builder.simplebuilder;

import com.sundae.creationalpattern.builder.simplebuilder.bean.Computer;
import com.sundae.creationalpattern.builder.simplebuilder.bean.MacBook;

/**
 * 具体建造者类
 */
public class MacBookBuilder extends Builder {
    private Computer mComputer = new MacBook();

    @Override
    void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    void buildOs() {
        mComputer.setOs();
    }

    @Override
    Computer build() {
        return mComputer;
    }
}
