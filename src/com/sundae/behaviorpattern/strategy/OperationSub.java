package com.sundae.behaviorpattern.strategy;

/**
 * 减法策略
 */
public class OperationSub implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
