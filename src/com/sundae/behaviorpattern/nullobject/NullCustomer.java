package com.sundae.behaviorpattern.nullobject;

/**
 * 空对象
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available object";
    }
}
