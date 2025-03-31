package com.yang.J2SE.oop.teststatic;

public class Car {
//    属于类  所有对象共享
    static String brand= "PORSCHE";

//    每个对象都有自己的空间
    String color;
    int wheel;
    int door;

//    静态方法  所有对象共享
    public static void printBrand(){
        System.out.println(brand);
    }
}
