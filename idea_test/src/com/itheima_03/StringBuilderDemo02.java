package com.itheima_03;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("hello");
        sb.append("java");
        sb.append(1000);

        //链式编程
        sb.append("sdf").append("sere").append("sdf").append(222);

        System.out.println("sb:" +sb);

        sb.reverse();
        System.out.println("sb:" +sb);

        String s = sb.toString();
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder);

    }
}
