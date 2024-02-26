package com.itheima_20;

import java.util.*;

public class PokerDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        String[] color = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


        int index = 0;

        for (String number : numbers) {
            for (String col : color) {
                hashMap.put(index, col + number);
                arrayList.add(index);
                index++;
            }
        }

        hashMap.put(index, "小王");
        arrayList.add(index);
        index++;
        hashMap.put(index, "大王");
        arrayList.add(index);

        //随机排序
        Collections.shuffle(arrayList);

        //发牌分组
        TreeSet<Integer> lll1 = new TreeSet<>();
        TreeSet<Integer> lll2 = new TreeSet<>();
        TreeSet<Integer> lll3 = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();

        for (int i = 0; i < arrayList.size(); i++) {
            Integer intx = arrayList.get(i);
            if (i >= arrayList.size() - 3) {
                dp.add(intx);
            } else if (i % 3 == 0) {
                lll1.add(intx);
            } else if (i % 3 == 1) {
                lll2.add(intx);
            } else if (i % 3 == 2) {
                lll3.add(intx);
            }
        }

        lookPoker("lll1",lll1,hashMap);
        lookPoker("lll2",lll2,hashMap);
        lookPoker("lll3",lll3,hashMap);
        lookPoker("dp",dp,hashMap);

    }

    public static void lookPoker (String name,TreeSet<Integer> treeSet,HashMap<Integer,String> hashMap){
        System.out.print(name+"的牌:");
        for (int x:treeSet){
            System.out.print(hashMap.get(x)+" ");
        }
        System.out.println("");
    }

}
