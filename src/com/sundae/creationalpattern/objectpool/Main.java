package com.sundae.creationalpattern.objectpool;

public class Main {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        Resource resource = objectPool.acquireResource();
        //... do Something
        objectPool.releaseResource(resource);		//回收资源
    }
}
