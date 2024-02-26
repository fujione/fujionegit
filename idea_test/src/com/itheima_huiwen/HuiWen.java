package com.itheima_huiwen;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: JavaSE_Code
 * @DESCRIPTION:
 * @USER: fujione
 * @DATE: 2024/2/22 14:53
 */
public class HuiWen {
    public static void main(String[] args) {
        int x = 110343011;
        int n = 0 ;
        for (int i = 1; x / i >= 1; i = i * 10) {
            int ys = x / i % 10;
            n = n * 10 +ys;
        }
        System.out.println(n == x);
    }
}
