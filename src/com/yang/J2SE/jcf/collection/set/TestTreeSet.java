package com.yang.J2SE.jcf.collection.set;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
//        树  会自动排序
        ts.add("a");
        ts.add("c");
        ts.add("g");
        ts.add("b");
        ts.add("z");
        ts.add("y");
//        lambda写法
        ts.forEach(System.out::println);
    }
}
