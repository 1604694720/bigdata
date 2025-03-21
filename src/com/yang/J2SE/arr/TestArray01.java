package com.yang.J2SE.arr;

import java.util.Arrays;

public class TestArray01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
    }
}
