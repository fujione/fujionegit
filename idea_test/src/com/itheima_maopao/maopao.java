package com.itheima_maopao;

/**
 * @PROJECT_NAME: JavaSE_Code
 * @DESCRIPTION:
 * @USER: fujione
 * @DATE: 2024/2/21 9:59
 */
public class maopao {
    public static void main(String[] args) {
        int[] mpq = {12, 13, 44, 2, 33, 4, 12,5,15};
        int[] mph = {};

        for (int length = 0;length<5;length++){
            for (int i = 0;i<mpq.length-1-length;i++){
                int temp = mpq[i];
                if (mpq[i]>mpq[i+1]){
                    mpq[i]=mpq[i+1];
                    mpq[i+1]=temp;
                }
            }
        }

        for (int i = 0;i<mpq.length ;i++){
            System.out.print((mpq[i])+",");
        }


    }
}
