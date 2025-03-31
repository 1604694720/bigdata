package com.yang.J2SE.oop.override;

public class Son extends Father{
//    方法的重写，返回类型，方法名，参数类型都需要相同。
    @Override
    public void help() {
        System.out.println("父上大人救我");
    }
}
