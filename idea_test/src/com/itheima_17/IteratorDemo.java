package com.itheima_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();

        collection.add("111");
        collection.add("222");
        collection.add("333");

        Iterator<String> iterator = collection.iterator();

        System.out.println(iterator.next());

        while (iterator.hasNext()){
            String next = iterator.next();
        }




    }
}
