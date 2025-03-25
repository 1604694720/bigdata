package com.yang.J2SE.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO02 {
    public static void main(String[] args) throws IOException {
//        创建流
        FileOutputStream fos = new FileOutputStream("D:\\dir.txt.bak.txt");
//        写
        fos.write(97);
//        关闭
        fos.close();
    }
}
