package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3_21_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            triangle(a,b,c);
        } catch (InputMismatchException e) {
            System.out.println("请输入整数作为三角形的边长");
        }catch (IllegalArgumentException e) {
            System.out.println("a,b,c不能构成三角形。");
        }

    }
    public static void triangle(int a, int b, int c) {
        if ((a+b>c) && (a+c>b) && (c+b>a)){
            System.out.printf("三角形的边长为：%d,%d,%d",a,b,c);
        }else throw new IllegalArgumentException("a,b,c不能构成三角形。");
    }
}
