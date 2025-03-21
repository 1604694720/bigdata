package com.yang.J2SE.exception;

public class TestException02 {
    public static void main(String[] args) {
        int a = 56;
        try {
//            throw 生成一个异常。
            throw new AgeException();
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }
}
