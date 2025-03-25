package com.yang.J2SE.file;

import java.io.File;

public class TestFile02 {
    public static void main(String[] args) {
        File dir = new File("D:\\dir");
        if(!dir.exists()){
            System.out.println(dir.mkdir());
//            创建多级目录 mkdirs()
        }
        File file = new File("D:\\dir.txt");
//        获取绝对路径
        System.out.println(file.getAbsolutePath());
    }
}
