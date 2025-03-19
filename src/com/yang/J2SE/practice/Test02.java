package com.yang.J2SE.practice;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("有多少个头？");
        int a = sc.nextInt();
        System.out.println("有多少个脚？");
        int b = sc.nextInt();
        System.out.printf("有 %d 只兔子。",b/2-a);
        System.out.printf("有 %d 只鸡。",a-(b/2-a));
    }
}
