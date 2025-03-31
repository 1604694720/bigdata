package com.yang.J2SE.lambda.function;

import java.util.ArrayList;
import java.util.function.Supplier;

public class TestSupplier02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = TestSupplier02.getNumber(5,()->(int)(Math.random()*100));
        list.forEach(System.out::println);
    }
    public static ArrayList<Integer> getNumber(int count, Supplier<Integer> sup){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(sup.get());
        }
        return list;
    }
}
