package com.yang.J2SE.lambda.function;

import java.util.function.Consumer;

public class TestConsumer01 {
    public static void main(String[] args) {
        Consumer consumer = (x)->{
            System.out.println(x);
        };
//        内置的四种之一，有参无返回
        consumer.accept("lxd");
    }
}
