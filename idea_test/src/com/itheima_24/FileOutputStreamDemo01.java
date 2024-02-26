package com.itheima_24;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("idea_test\\fos1.txt");
        for(int i = 0; i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r".getBytes());
        }
        fos.close();
    }
}
