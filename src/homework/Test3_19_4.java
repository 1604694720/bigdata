package homework;

import java.util.Scanner;
public class Test3_19_4 {
    public static void main(String[] args) {
        js();
    }

    public static void js() {
        Scanner sc = new Scanner(System.in);
        abc1:
        while (true){
            System.out.println("---------------------------计算小工具----------------------------");
            System.out.println("1.计算圆面积 2.计算周长 3.计算体积 4.秒转分钟 5.单位换算(￥->$） 6.退出");
            System.out.println("---------------------------------------------------------------");
            System.out.println("你选择的操作：");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("输入半径：");
                    System.out.println(+Test3_19_3.area(sc.nextDouble()));
                    break;
                case 2:
                    System.out.println("分次输入长和宽");
                    System.out.println(zc(sc.nextInt(),sc.nextInt()));
                    break;
                case 3:
                    System.out.println("分次输入半径和高。");
                    System.out.println(Test3_19_3.volume(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 4:
                    System.out.println("输入多少秒钟：");
                    System.out.println(fz(sc.nextInt()));
                    break;
                case 5:
                    System.out.println("输入需要转换的金额");
                    System.out.println(money(sc.nextDouble()));
                    break;
                case 6:
                    System.out.println("see you!");
                    break abc1;
            }
        }
    }
    public static int zc(int a, int b) {
        return 2*(a+b);
    }
    public static double fz(int a) {
        return (double) a /60;
    }
    public static double money(double a) {
        return a/7.2312;
    }
}