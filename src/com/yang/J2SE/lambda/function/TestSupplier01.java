package com.yang.J2SE.lambda.function;

import java.util.function.Supplier;

public class TestSupplier01 {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->{
            return "0k";
        };
//        内置四个之一，无参有返回。
        System.out.println(supplier.get());
    }
}
