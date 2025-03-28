package com.yang.J2SE.jcf.comparator;

import com.yang.J2SE.io.objectio.TestDog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestDogs {
    public static void main(String[] args) {
        ArrayList<TestDog> list = new ArrayList<>();
        list.add(new TestDog("李湘东","黑色",18));
        list.add(new TestDog("彭正宇","白色",22));
        list.add(new TestDog("李涛","玄色",20));

//        TestDog类需要实现Comparable<TestDog>接口,不然会报错
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
