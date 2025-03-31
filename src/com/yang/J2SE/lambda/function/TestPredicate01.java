package com.yang.J2SE.lambda.function;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicate01 {
    public static void main(String[] args) {
        Predicate<String> predicate = (x)->{
            return x.length()>5;
        };
        System.out.println(predicate.test("anbv"));
    }
}
