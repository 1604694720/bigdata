package com.yang.J2SE.jcf.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet01 {
    public static void main(String[] args) {
//        创建  等同于集合
//        <>与列表一致。
        HashSet set = new HashSet();
//        增删改查
        set.add("李湘东");
        set.add("是傻逼？");
        set.add("是的！");
        set.add(2);
        set.add("不是");
        set.add(2);
        set.remove("不是");
//        改即删除后增加。
//        遍历查找，需要迭代器工具类
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        set.remove();
    }
}
