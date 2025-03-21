package com.yang.J2SE.exception;

import java.util.Scanner;

public class TestException01 {
    public static void main(String[] args) {
        int a = 10;
        Scanner sc = new Scanner(System.in);
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("111111");
    }
}
