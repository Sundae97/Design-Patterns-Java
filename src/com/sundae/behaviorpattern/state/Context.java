package com.sundae.behaviorpattern.state;

/**
 * 状态管理类  -- 带有一种状态
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void start(){
        getState().start(this);
    }

    public void close(){
        getState().close(this);
    }
}
