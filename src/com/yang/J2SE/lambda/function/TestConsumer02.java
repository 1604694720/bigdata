package com.yang.J2SE.lambda.function;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;
import java.util.Collection;

public class TestConsumer02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("l");
        list.add("x");
        list.add("d");
        list.add("s");
        list.add("b");
//        forEach传入Consumer类型
        list.forEach(s-> System.out.println(s));
//        list.forEach(System.out::println);
//        可简写

    }
}
