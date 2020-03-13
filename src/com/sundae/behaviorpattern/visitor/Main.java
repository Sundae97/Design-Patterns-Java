package com.sundae.behaviorpattern.visitor;

/**
 * 访问者模式
 */
public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
