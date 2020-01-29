package com.sundae.behaviorpattern.interpreter;

/**
 * 解释器模式  -  Interpreter Pattern
 */
public class Main {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator();
        //逆波兰表示法
        System.out.println(evaluator.evaluate("1 2 +"));        //1+2
        System.out.println(evaluator.evaluate("5 2 -"));        //2-5
        System.out.println(evaluator.evaluate("4 8 - 2 +"));    //8-4+2
    }
}
