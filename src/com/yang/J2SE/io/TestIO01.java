package com.yang.J2SE.io;

import java.io.FileInputStream;
import java.io.IOException;

public class TestIO01 {
    public static void main(String[] args) throws IOException {
//        创建流
//        字节  单位为字节，一次读一个
        FileInputStream fis = new FileInputStream("D:/dir.txt");
        int a = -1;
//        =========业务操作======
//        如果为-1,则表示到末尾了.
        while((a=fis.read())!=-1){
            System.out.print((char)a);
        }
//        关闭
        fis.close();
    }
}
