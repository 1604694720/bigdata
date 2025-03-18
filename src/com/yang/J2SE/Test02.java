package com.yang.J2SE;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//        从键盘输入
        int sc = scanner.nextInt();
        if (sc >=18 ) {
            System.out.println("你已经是个社会人了！");
        }else {
            System.out.println("你还只是个孩子呀！");
        }
    }
}
