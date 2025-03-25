package com.yang.J2SE.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestArrayTransfer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/Test/T.txt");
        FileOutputStream fos = new FileOutputStream("D:/Test/x.txt");
        byte[] buf = new byte[1024];
        int len=0;
        while((len=fis.read(buf))>0){
            System.out.println(buf.toString());
            fos.write(buf,0,len);
        }
        fis.close();
        fos.close();
    }
}
