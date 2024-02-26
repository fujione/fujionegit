package com.itheima_char;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @PROJECT_NAME: JavaSE_Code
 * @DESCRIPTION:
 * @USER: fujione
 * @DATE: 2024/2/21 15:03
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.get(c)==null){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        Set<Character> characters = map.keySet();
        for (Character c :characters){
            System.out.print(c+"("+map.get(c)+")");
        }
    }
}
