package com.yang.J2SE.oop.life;
/*
* 单列单态模式
* */
public class Factory {
//    私有化，外面不能修改
    private static Factory factory = null;
//    静态块创建
    static {
    System.out.println("创建前的准备工作");
    factory = new Factory();
}
//    私有化构造器，不能在外部创建
    private Factory(){}

//    只能使用静态方法获取或者创建。
    public static Factory getFactory(){
        return factory;
    }
}
