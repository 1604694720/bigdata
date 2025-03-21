package com.yang.J2SE.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException03 {
    public static void main(String[] args) throws FileNotFoundException {
//        main可以继续抛出异常，但是会停止运行
        try {
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
//    throws 抛出异常，谁调用谁处理
    public static void test() throws FileNotFoundException {
        FileInputStream fil = new FileInputStream("D:/data.txt");
    }
}
