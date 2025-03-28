package com.yang.J2SE.jcf.collection.list;

import java.util.Stack;

public class TestStack01 {
    public static void main(String[] args) {
//    创建一个栈
        Stack stack = new Stack();
//    压栈 将数据放入栈中
        stack.push("李湘东");
        stack.push("是");
        stack.push("傻逼！");

//        看有没有 同时返回数据
        System.out.println(stack.peek());

//        弾栈 出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        if(!stack.isEmpty()){
//            判断是否为空
            System.out.println(stack.pop());
        }else {
            System.out.println("null");
        }
    }
}
