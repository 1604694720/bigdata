package com.yang.J2SE.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {
    public static void main(String[] args) {
        String a = null;
        int b = a.length();
//        发生一个空指针异常，非检查异常。建议使用代码控制。
        try {
            FileInputStream fis = new FileInputStream("D:/data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//        检查异常，建议使用try
    }
}
