package com.itheima_16;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("D:\\工作资料\\workspace");
        String name = file.getName();
        System.out.println("name："+name);

    }
}
