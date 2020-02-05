package com.sundae.behaviorpattern.state;

/**
 * 状态具体类
 */
public class CloseState implements State {
    @Override
    public void start(Context context) {
        context.setState(new CloseState());
        System.out.println("start");
    }

    @Override
    public void close(Context context) {
    }
}
