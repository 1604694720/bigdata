package com.yang.J2SE;
import java.util.Scanner;
public class pzy {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入菱形层数,只能为奇数层， 且最少3层");
        int a = 3;
        int b= sc.nextInt();
        int c = b-1;
        int d = b-1;
            for (int i = a; i > 1; i--) {
                for (int j = c; j >= 1; j--){
                    System.out.print("~");
                }
                for (int m= d; m < b; m++){
                    System.out.print("*");
                }
                d=d-(b-1);
                c=c-(b-1)/2;
                System.out.println();
            }
            for (int i = 1; i <= a ; i++) {
                for (int j = 1; j <= c; j++) {
                    System.out.print("~");
                }
                for (int m= b; m > d; m--){
                    System.out.print("*");
                }
                d=d+(b-1);
                c=c+(b-1)/2;
                System.out.println();
            }
      }
}

