package com.yang.J2SE.arr;

import java.util.Arrays;

public class TestTwoArray01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
//        必须先定义行数，不可不先定义列数
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[6];
//        每一行的列数可以不相等。
//数组1        0地址   1地址   2地址
//数组2 (0array) 0      1       2
//数组3 (1array) 0      1
//数组4 (2array) 0      1       2     3     4     5     6
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        deep:深的。
//        Arrays.deepToString() 内置方法，可以输出二维数组。
        System.out.println(Arrays.deepToString(arr));
    }
}
