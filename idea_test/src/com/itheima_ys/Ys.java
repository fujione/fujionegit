package com.itheima_ys;

/**
 * @PROJECT_NAME: JavaSE_Code
 * @DESCRIPTION:
 * @USER: fujione
 * @DATE: 2024/2/22 15:38
 */
public class Ys {

    public static void main(String[] args) {
        int bcs = 28;
        int cs = 23;


        int i = 0;
        while (bcs>=cs){
            bcs = bcs - cs;
            i++;
        }

        System.out.println("商为"+i+",余数为"+bcs);



    }
}
