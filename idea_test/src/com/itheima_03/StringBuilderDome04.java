package com.itheima_03;

import java.util.Scanner;

public class StringBuilderDome04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }

    public static String reverse(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        return sb.toString();
        return new StringBuilder(s).reverse().toString();
    }
}
