package com.sundae.behaviorpattern.strategy;

/**
 * 策略模式
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.execute(1,2));

        context = new Context(new OperationSub());
        System.out.println(context.execute(5,3));
    }
}
