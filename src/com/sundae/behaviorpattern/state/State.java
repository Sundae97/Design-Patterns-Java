package com.sundae.behaviorpattern.state;

/**
 * 状态接口类
 */
public interface State {
    void start(Context context);
    void close(Context context);
}
