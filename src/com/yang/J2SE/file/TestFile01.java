package com.yang.J2SE.file;


import java.io.File;
import java.util.Date;

public class TestFile01 {
    public static void main(String[] args) {
        //创建一个文件对象
        File file = new File("D:\\dir.txt");
        System.out.println("是否存在="+file.exists());
        System.out.println("大小=" + file.length());
        System.out.println("是否隐藏=" + file.isHidden());
        System.out.println("能否修改=" + file.canWrite());
//        file.delete();删除文件
//        最后修改时间
        Date date = new Date(file.lastModified());
        System.out.println(date);
    }
}
