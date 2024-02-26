package com.itheima_23;

import java.io.File;

public class DiGuiDemo2 {
    public static void main(String[] args) {
        File file = new File("D:\\迅雷下载");
        f(file);

    }

    public static void f (File file){
        if (file.isFile()){
            System.out.println(file.getAbsoluteFile());
        }else if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1:files){
                f(file1);
            }
        }
    }

}
