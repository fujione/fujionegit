package com.itheima_18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
            ArrayList<String> list1 = new ArrayList<>();
            LinkedList<String> list2 = new LinkedList<>();

            list1.add("11");
            list1.add("22");
            list1.add("33");

            Iterator<String> iterator = list1.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

            list2.add("11");
            list2.add("22");
            list2.add("33");

            for (String s:list2){
                System.out.println(s);
            }
    }
}
