package com.yang.J2SE.oop.life;

public class ShunSv {
//    =================================1
//    静态块和静态变量，谁在前谁先加载。
    static int b=testb();
    static {//静态块
        System.out.println("静态块");
    }
//    =================================2
    {//非静态块
        System.out.println("非静态块");
    }
    int a=testa();
//    ================================3
    public ShunSv(){
        System.out.println("构造方法");
    }
    public void test01(){
        System.out.println("非静态test01");
    }
    public static void test02(){
        System.out.println("静态test02");
    }
//    ===============================4
    public static int testa(){
        System.out.println("int a");
        return 1;
    }
    public static int testb(){
        System.out.println("int b");
        return 1;
    }
}
