package com.yang.J2SE;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Tools {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("--------------------菜单--------------------");
            System.out.println(" 1.计算圆面积 2.计算圆柱体积 3.当前时间 4.exit");
            System.out.println("--------------------------------------------");
            System.out.println("请选择你的操作：");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("请输入圆的半径：");
                    int b = sc.nextInt();
                    System.out.println("面积为："+(b*Math.PI));
                    break;
                    case 2:
                        System.out.println("请输入圆的半径：");
                        int c = sc.nextInt();
                        System.out.println("请输入圆柱的高：");
                        int d = sc.nextInt();
                        System.out.println("体积为："+(c*Math.PI*d));
                        break;
                        case 3:
                            System.out.println("当前时间为"+ LocalDateTime.now().toLocalDate());
                            break;
                            case 4:
                                flag = false;
                                System.out.println("see yoo!");
                                break;
            }
        }
    }
}
