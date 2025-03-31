package com.yang.J2SE.oop.override;

public class Father {
    public void help(){
        System.out.println("老天爷保佑");
    }

//    方法的重构
    public void help(int a){
        if (a>30){
            System.out.println("求人不如求己");
        }
    }
}
