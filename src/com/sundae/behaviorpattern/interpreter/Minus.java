package com.sundae.behaviorpattern.interpreter;

/**
 * 减法规则
 */
public class Minus implements Expression {
    Expression left, right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float interpret() {
        return left.interpret() - right.interpret();
    }
}
