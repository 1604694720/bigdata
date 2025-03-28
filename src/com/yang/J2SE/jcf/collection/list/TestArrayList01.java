package com.yang.J2SE.jcf.collection.list;

import java.util.ArrayList;

public class TestArrayList01 {
    public static void main(String[] args) {
//        创建容器 等同于Python列表
//        可以为任意类型
//        ArrayList<String> list = new ArrayList();
//        <数据类型>锁死数据类型，只能放该类型的数据
        ArrayList list = new ArrayList();
//        增  自动扩容
        list.add("A");
        list.add("B");
        list.add(3);
        list.add("C");
//        删
        list.remove(3);
//        改
        list.set(1,2);
//        查
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
