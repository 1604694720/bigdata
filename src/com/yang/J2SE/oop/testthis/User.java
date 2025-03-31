package com.yang.J2SE.oop.testthis;

public class User {
    String userName;
    int age;
    public User(){}
    public User(String userName){
//        调用其他构造方法的代码  只能在第一行！！！
        this(userName,0);
    }
    public User(String userName,int age){
        this.userName=userName;
        this.age=age;
    }
}
