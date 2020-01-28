package com.sundae.creationalpattern.objectpool;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象池模式
 */
public class ObjectPool {

    private List<Resource> available = new ArrayList<>();

    public Resource acquireResource(){
        if(available.size() <= 0){
            Resource resource = new Resource();
            return resource;
        }else{
            return available.remove(0);
        }
    }

    public void releaseResource(Resource resource){
        available.add(resource);
    }

}

class Resource {
}
