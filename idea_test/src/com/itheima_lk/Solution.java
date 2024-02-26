package com.itheima_lk;

import java.util.ArrayList;

public class Solution {

    public String intToRoman(int num) {
        int jg = 0;
        int ys = 0;
        int sb = 1;
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        ArrayList<Integer> list = new ArrayList<>();
        while(num!=0){
            ys = num % 10;
            ys *= sb;
            list.add(ys);
            num = num / 10;
            sb *=10;
        }
        System.out.println(list.toString());
        if (list.size()>0){
            if(list.get(0)==0){
                s1 = "";
            }else if(list.get(0)<3){
                for(int i=1;i<=list.get(0);i++){
                    s1 = s1 + "I";
                }
            }else if(list.get(0)==4){
                s1 = "IV";
            }else if(list.get(0)==5){
                s1 = "V";
            }else if(list.get(0)<9){
                for(int i=1;i<=list.get(0)-5;i++){
                    s1 = s1 + "I";
                }
                s1 ="V" + s1 ;
            }
        }

        if (list.size()>1){
            if(list.get(1)<30){
                for(int i=1;i<=list.get(1)/10;i++){
                    s2 = s2 + "X";
                }
            }else if(list.get(1)==40){
                s2 = "XL";
            }else if(list.get(1)==50){
                s2 = "L";
            }else if(list.get(1)<90){
                for(int i=1;i<=list.get(1)/10-5;i++){
                    s2 = s2 + "X";
                }
                s2 =  "L" + s2;
            }
        }

        if(list.size()>2){
            if(list.get(1)<300){
                for(int i=1;i<=list.get(1)/100;i++){
                    s3 = s3 + "C";
                }
            }else if(list.get(1)==400){
                s3 = "CD";
            }else if(list.get(1)==500){
                s3 = "D";
            }else if(list.get(1)<900){
                for(int i=1;i<=list.get(1)/100-5;i++){
                    s3 = s3 + "C";
                }
                s3 =  "D" + s3;
            }
        }

        if (list.size()>3){
            for (int i=1;i<=list.get(1)/1000;i++){
                s4 = s4 + "M";
            }
        }

        return s4+s3+s2+s1;

    }

    public static void main(String[] args) {
        Solution SS = new Solution();
//        int i = SS.trailingZeroes(25);
//        System.out.println(i);
//        System.out.println(-144%10);
        SS.intToRoman(58);

    }
}
