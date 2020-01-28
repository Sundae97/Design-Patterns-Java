package com.sundae.creationalpattern.builder.chainbuilder;

/**
 * 产品抽象类
 */
public class Computer {
    protected String mBoard;
    protected String mDisplay;

    protected Computer() {
    }

    private Computer(Builder builder) {
        mBoard = builder.mBoard;
        mDisplay = builder.mDisplay;
    }

    public void setBoard(String board) {
        mBoard = board;
    }

    public void setDisplay(String display) {
        this.mDisplay = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                '}';
    }


    /**
     * InnerBuilder插件生成的链式建造者类
     */
    public static final class Builder {
        private String mBoard;
        private String mDisplay;

        public Builder() {
        }

        public Builder mBoard(String val) {
            mBoard = val;
            return this;
        }

        public Builder mDisplay(String val) {
            mDisplay = val;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
