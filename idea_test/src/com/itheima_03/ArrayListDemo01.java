package com.itheima_03;

import java.util.ArrayList;

public class ArrayListDemo01{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("array:"+arrayList);
        arrayList.add("hello");
        arrayList.add("hello");
        System.out.println("array:"+arrayList);
        arrayList.add(0,"hi");
        System.out.println("array:"+arrayList);
        arrayList.remove("hello");
        System.out.println("array:"+arrayList);
        arrayList.set(0,"hello");
        System.out.println("array:"+arrayList);
        for(String temp:arrayList){
            System.out.println(temp);
        }
    }

}
