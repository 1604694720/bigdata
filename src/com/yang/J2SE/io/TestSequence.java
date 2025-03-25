package com.yang.J2SE.io;

import java.io.*;
import java.util.Vector;

public class TestSequence {
    public static void main(String[] args) throws IOException {
        FileInputStream fr01 = new FileInputStream("D:/Test/T.txt");
        FileInputStream fr02 = new FileInputStream("D:/Test/e.txt");
//        序列流 合并流
        SequenceInputStream sis = new SequenceInputStream(fr01,fr02);
        int a;
        while((a=sis.read())!=-1){
            System.out.print((char)a);
        }
        fr01.close();
        fr02.close();
        sis.close();
    }

}
