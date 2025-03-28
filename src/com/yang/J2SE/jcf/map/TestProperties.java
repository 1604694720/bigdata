package com.yang.J2SE.jcf.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
//        创建一个属性文件
        Properties prop = new Properties();
        prop.load(new FileReader("conf/db.properties"));
//        读内容
        String str = prop.getProperty("ip");
        System.out.println(str);

//        写入文件
        prop.setProperty("ip","127.0.0.1");
//        store 存储，无此方法不写入文件。
        prop.store(new FileWriter("conf/db.properties"),"db conf");
        System.out.println(prop.getProperty("ip"));
    }
}
