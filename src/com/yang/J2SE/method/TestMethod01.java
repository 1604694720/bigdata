package com.yang.J2SE.method;

import java.util.Scanner;

public class TestMethod01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = getmj(a, b);
        System.out.println(c);
    }
//    /**+Enter 添加文档注释，便于查看方法信息
    /**
     * 圆柱体积计算
     * @param a 半径
     * @param b 高
     * @return double返回圆柱的面积
     */
    public static double getmj(double a,double b) {
        return a*a*b*Math.PI;
    }
}
