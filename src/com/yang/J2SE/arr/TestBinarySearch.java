package com.yang.J2SE.arr;

import java.util.Scanner;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left <=right){
            int modil = (left+right)/2;
            if (key>arr[modil]){
                left = modil+1;
            } else if (key<arr[modil]) {
                right=modil-1;
            }else if (key==arr[modil]){
                index=modil;

                break;
            }
        }
        System.out.println(index);
    }
}
