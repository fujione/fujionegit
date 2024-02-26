package com.itheima_13;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "22 32 3 23 55";
        String[] strArray = s.split(" ");
        int[] intArray = new int[5];
        for (int i = 0;i<strArray.length;i++){
            intArray[0]=Integer.parseInt(strArray[0]);
        }
        Arrays.sort(intArray);
        System.out.println(intArray.toString());
        String ss = " 22 33 33";
        String SSS = s+ss;
        System.out.println(SSS);
    }
}
