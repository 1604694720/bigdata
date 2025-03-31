package com.yang.J2SE.lambda;

public class TestHPNR {

    public static void main(String[] args) {
        HasParamNoReturn hpnr = (String name)->{
            System.out.println(name+"傻逼");
        };
        hpnr.HPNR("李湘东");
    }
}
