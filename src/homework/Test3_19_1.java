package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Test3_19 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("总分"+Arrays.stream(arr).sum());
        System.out.println("平均分"+ Arrays.stream(arr).average());
        System.out.println("最高分"+ Arrays.stream(arr).max());
        System.out.println("最低分"+ Arrays.stream(arr).min());
    }
}
