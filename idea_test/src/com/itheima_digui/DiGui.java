package com.itheima_digui;

/**
 * @PROJECT_NAME: JavaSE_Code
 * @DESCRIPTION:
 * @USER: fujione
 * @DATE: 2024/2/21 15:22
 */
public class DiGui {
    public static void main(String[] args) {
        int f = f(5);
        System.out.println(f);

    }

    static int f(int n) {
        if (n == 1) {
            return 1;
        }else {
            return n * f(n-1);
        }
    }
}
