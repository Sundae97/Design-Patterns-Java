package com.sundae.behaviorpattern.visitor;

/**
 * 元素
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
