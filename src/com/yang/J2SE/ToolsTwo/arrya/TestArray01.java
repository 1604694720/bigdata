package com.yang.J2SE.ToolsTwo.arrya;

import java.util.Arrays;

public class TestArray01 {
    public static void main(String[] args) {
        int[] arr = {4,2,9,3,6,2,10};
        Arrays.sort(arr);
//        排序
        Arrays.stream(arr).forEach(System.out::println);
//        lambda写法
//        二分
        System.out.println(Arrays.binarySearch(arr, 9));
//        填充,全部变为11。
        Arrays.fill(arr,11);
        System.out.println(Arrays.toString(arr));
    }
}
