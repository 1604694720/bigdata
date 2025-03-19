package com.yang.J2SE.method;

public class TestMethod02 {
    public static void main(String[] args) {
//        void修饰为无返回值。
    }
//    有参有返回
    public static double getmj(double a) {
        return Math.PI;
    }
//    有参无返回
    public static  void setmj(double a) {

    }
//    无参有返回
    public static double getPI() {
        return Math.PI;
    }
//    无参无返回
    public static  void setPI() {
        System.out.println(Math.PI);
    }
}
