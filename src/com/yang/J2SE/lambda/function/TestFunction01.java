package com.yang.J2SE.lambda.function;

import java.util.function.Function;

public class TestFunction01 {
    public static void main(String[] args) {
        Function<Integer,String> function=(x)->{
            return "age="+x;
        };
        System.out.println(function.apply(100));
    }
}
