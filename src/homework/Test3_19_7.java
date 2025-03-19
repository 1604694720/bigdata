package homework;

import java.util.Scanner;

public class Test3_19_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0;
        int c=0;
        int d=Integer.toString(a).length();
//        将int改成字符串型获取长度
        for (int i = 1; i <= d; i++) {
            c=a%10;
            a=a/10;
            b=c+b*10;
        }
        System.out.println(b);
    }
}
