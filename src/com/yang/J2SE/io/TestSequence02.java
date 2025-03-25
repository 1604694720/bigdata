package com.yang.J2SE.io;

import java.io.File;
import java.util.Vector;

public class TestSequence02 {
    public static void main(String[] args) {
//        作业
//        使用Vector接收
        File file = new File("D:/Test");
        File[] files = file.listFiles();
        Vector v = new Vector();
        for(File f:files){
            v.addElement(f);
        }
        System.out.println(v.get(0).getClass());
    }
}
