package com.itheima_03;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,6,7};
        System.out.println(arrayToString(arr));

    }

    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]+",");
            }

        }

        sb.append("]");
        return sb.toString();
    }
}
