package com.itheima_02;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");

        String line = sc.nextLine();
        String fanzhuan = fanZhuan(line);
        System.out.println(fanzhuan);

    }

    public static String fanZhuan(String s){
        String ss="";
       for(int i = s.length()-1;i>=0;i--){
           ss += s.charAt(i);
       }
        return ss;
    }

}
