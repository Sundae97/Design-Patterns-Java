package com.sundae.behaviorpattern.iterator;

public class StringRepository implements Container {
    private String strs[] = {"AAAA", "BBBB", "CCCC"};
    @Override
    public Iterator getIterator() {
        return new StringIterator();
    }

    /**
     * 可单独提出作为一个公共使用的类
     */
    private class StringIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            return index < strs.length;
        }

        @Override
        public Object next() {
            if (hasNext())
                return strs[index++];
            return null;
        }
    }
}
