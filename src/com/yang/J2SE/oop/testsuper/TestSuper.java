package com.yang.J2SE.oop.testsuper;

public class TestSuper {
    public static void main(String[] args) {
//        Son son = new Son();
//        son.getHouse();
//        son.getFatherHouse();
        Father obj=new Son();
        obj.getName();
    }
}

class Father{
    static int house = 10;
    public static void getHouse(){
        System.out.println(house);
    }
    public static void getName(){
        System.out.println("Father");
    }
}
//Son继承于父类Father
class Son extends Father{

    static int house = 1;

//    重写父类的getHouse方法，如果子类Son未重新赋值给house，则默认调用父类的house。
//    静态方法可以被继承不能被重写。

    public static void getName(){
        System.out.println("Son");
    }
//    super调用父类的属性
    public void getFatherHouse(){
        System.out.println(super.house);
    }
}