package com.sundae.behaviorpattern.template;

/**
 * 模板抽象类
 */
public abstract class People {
    protected abstract void eat();
    protected abstract void work();
    protected abstract void sleep();

    // 模板方法被设置为final
    public final void toLive(){
        eat();
        work();
        sleep();
    }

}
