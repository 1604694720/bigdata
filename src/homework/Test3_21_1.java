package homework;

import java.util.Scanner;

public class Test3_21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(10 - n);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("not int");
        }
    }
}
