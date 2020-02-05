package com.sundae.behaviorpattern.state;

/**
 * 状态模式
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // 初始为开始状态
        context.setState(new StartState());
        // 切换为关闭状态
        context.close();
        // 切换为开始状态
        context.start();
    }
}
