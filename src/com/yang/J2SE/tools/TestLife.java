package com.yang.J2SE.tools;

import java.util.Random;
import java.util.Scanner;

public class TestLife {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("你叫什么？");
//        从键盘输入Scanner
        String a=sc.next();
        System.out.println("你多少岁了？");
        int b=sc.nextInt();
//        随机数
        int c = (int) (Math.random()*50);
        System.out.println(a+"，你能活到"+(b+c+30));
    }
}
