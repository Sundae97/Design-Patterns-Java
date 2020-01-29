package com.sundae.behaviorpattern.iterator;

/**
 * 迭代器模式  -  Iterator Pattern
 */
public class Main {
    public static void main(String[] args) {
        StringRepository stringRepository = new StringRepository();
        for (Iterator iterator = stringRepository.getIterator(); iterator.hasNext();){
            String str = (String) iterator.next();
            System.out.println("String --> " + str);
        }
    }
}
