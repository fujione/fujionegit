package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        //isEvenNumber(10);
//        double a = maxNumber(10.0,20.0);
//        System.out.println(a);
//        int[] arr = {11,22,5,45,5};
//        shuzu(arr);
//        System.out.println(qiuhe(10));
//        qiao7();
//tuzi();
//        ji();
//        int[] arr = {22,33,44,55,66};
//
//        changearr(arr);
//        shuzu(arr);
//        int[] arr = new int[6];
//        dafen(arr);
//        shuzu(arr);



    }

    public static void isEvenNumber(int a){

        if(a%2==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static int maxNumber(int a ,int b){
        int max =a>b?a:b;
        System.out.println(max);
        return max;
    }

    public static double maxNumber(double a ,double b){
        //double max = a > b ? a : b;
        //System.out.println(max);
        double max = Math.max(a,b);
        return max;

    }

    public static boolean compare(int a ,int b){
        return a==b;
    }

    public static void shuzu(int[] arr){
        int i = 0;
        for(int temp:arr){
            i++;
            if (i==arr.length){
                System.out.print(temp);
            }else {
                System.out.print(temp+",");
            }

        }
    }

    public static int qiuhe(int a){
        int sum=0;
        for (int i = 0;i<=a;i++){
            if(i%2==0){
                sum+= i;
            }
        }
        return sum;
    }

    public static void qiao7(){
        for(int i = 0;i<=100;i++){
            if(i%10==7 || i/10%10==7||i%7==0){
                System.out.println(i);

            }
        }
    }

    public static void tuzi(){
        int[] arr = new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int i =2;i<=arr.length-1;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int a :arr){
            System.out.println(a);
        }
    }

    public static void ji(){
        for (int x = 0;x<=20;x++){
            for (int y=0;y<=33;y++){
                int z=100 -x-y;
                if (5*x+3*y+z/3==100&&z%3==0){
                    System.out.println("x:"+x+",y:"+y+",z:"+z);
                }
            }
        }
    }

    public static void changearr(int[] arr){
        for(int start = 0,end = arr.length-1;start<=end;start++,end--){
            int temp = arr[start];
            arr[start] =  arr[end] ;
            arr[end]  =temp;
        }
    }

    public static void dafen(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<arr.length;i++){
            System.out.println("请输入评委打分");
            arr[i] = sc.nextInt();
        }
    }

//    public static int geiMax(int[] arr){
//
//    }


}
