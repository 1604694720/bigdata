package com.yang.J2SE.jcf.map;

import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap map = new TreeMap<>();
        map.put("a","0");
        map.put("d","1");
        map.put("z","2");
        map.put("f","3");
        map.put("k","4");
        map.put("i","5");
        Set<String> set = map.keySet();
        for(String str:set){
            System.out.println(str);
        }
    }
}
