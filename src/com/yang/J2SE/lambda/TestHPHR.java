package com.yang.J2SE.lambda;

public class TestHPHR {
    public static void main(String[] args) {
        HasParamHasReturn hpsr = (S)->{
            return S+"傻逼";
        };

        System.out.println(hpsr.HPHR("李湘东"));
    }
}
