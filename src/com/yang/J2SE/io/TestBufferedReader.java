package com.yang.J2SE.io;

import java.io.*;

public class TestBufferedReader {
    public static void main(String[] args) throws IOException {
//        输入流 结点流
        FileReader fr = new FileReader("D:/lrc.lrc");
//        输入流 处理流
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        int index = 0;
        while((line=br.readLine())!=null){
            System.out.println(++index+"+"+line);
        }
//        关闭
        fr.close();
        br.close();
    }
}
