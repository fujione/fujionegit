package com.itheima_19;

import java.util.Arrays;

public class GenericDemo {
    public static void main(String[] args) {
//        Generic<String> g1 = new GenericImpl<String>();
//        GenericImpl<String> g2 = new GenericImpl<String>();
//        g1.show("ss");
//        g2.show("dd");
        sum(11,11,11);
    }

        public static int sum(int... a) {
            int sum = Arrays.stream(a).sum();
            System.out.println(sum);
            return sum;
        }

}
