package com.yang.J2SE.jcf.map;

import java.util.*;

public class TestHashMap01 {
    public static void main(String[] args) {
//        HashMap<Integer,Integer> map = new HashMap();
//        创建  <>需要同时列出Key和Value或者都不列出
        HashMap map = new HashMap();
        map.put("name","李湘东");
        map.put("age",18);
        map.put("live","傻逼");

        System.out.println(map.get("name"));
//        没有找到就输出defaultValue
        System.out.println(map.getOrDefault("id", "没有id"));

//        删除
        map.remove("age");

//        改，即重新把Value赋值给Key
        map.put("live","大傻逼");
        System.out.println(map.get("live"));

//        查
        Set<String> keys = map.keySet();//将key传给set集合
        System.out.println("======增强for");
        for(String key:keys){
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("=======迭代器iterator");
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next + "=" + map.get(next));
        }
        System.out.println("======取得key=value组");
        Set<Map.Entry> entried = map.entrySet();
        for(Map.Entry entry : entried){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("======取得所有值");
        Collection<String> values = map.values();
        for(String value:values){
            System.out.println(value);
        }
    }
}
