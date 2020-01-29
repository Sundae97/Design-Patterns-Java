package com.sundae.behaviorpattern.interpreter;

/**
 * 加法规则
 */
public class Plus implements Expression {
    Expression left, right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float interpret() {
        return left.interpret() + right.interpret();
    }
}
