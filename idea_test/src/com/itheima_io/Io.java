package com.itheima_io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @PROJECT_NAME: JavaSE_Code
 * @DESCRIPTION:
 * @USER: fujione
 * @DATE: 2024/2/22 16:59
 */
public class Io {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("idea_test/test1.txt"));
        bufferedOutputStream.write("hello\r\n".getBytes());
        bufferedOutputStream.write("world\r\n".getBytes());
        bufferedOutputStream.close();
    }
}
