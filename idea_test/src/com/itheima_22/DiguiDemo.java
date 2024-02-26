package com.itheima_22;

public class DiguiDemo {
    public static void main(String[] args) {
        DiguiDemo diguiDemo = new DiguiDemo();
        int f = diguiDemo.f(31);
        System.out.println(f);
    }


    public int f(int n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
