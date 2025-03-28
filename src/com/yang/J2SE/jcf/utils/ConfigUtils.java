package com.yang.J2SE.jcf.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
//    私有的，静态的
    private static Properties prop = new Properties();

//    静态代码块，在类加载的时候就运行
    static {
    try {
        prop.load(new FileReader("conf/db.properties"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    public static String getValue(String key){
        return prop.getProperty(key);
    }
}
