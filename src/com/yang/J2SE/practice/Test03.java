package com.yang.J2SE.practice;

import java.util.Arrays;

public class Test03 {

    public static void main(String[] args) {
        int[] a = new int[3];

        int b=0;
        do {
            a[0] = (int)(Math.random()*6)+1;
            a[1] = (int)(Math.random()*6)+1;
            a[2] = (int)(Math.random()*6)+1;
            Arrays.sort(a);
            b++;
            System.out.printf(Arrays.toString(a));
            if (a[0] == a[1] || a[1] == a[2]) {
                if (a[0] == a[1] && a[1] == a[2]) {
                    System.out.printf("豹子。第%d次",b);
                    break;
                }
                System.out.println("双");
            }else if ((a[1]-a[0]==1) && (a[2] - a[1]==1)) {
                System.out.printf("顺%s\n",Arrays.toString(a));
            }else System.out.printf("单%d\n",a[2]);
        }while (true);
    }
}
