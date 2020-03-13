package com.sundae.behaviorpattern.strategy;

/**
 * 加法策略
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
