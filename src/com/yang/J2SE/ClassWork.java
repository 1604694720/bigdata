package com.yang.J2SE;

public class ClassWork {
    public static void main(String[] args) {
        Point yd = new Point();
        Point p01 = new Point(1,1,1);
        System.out.println(p01.pointyd());
        p01.setX(2);
        Point p02 = new Point(2,3,4);
        System.out.println(p02.pointqt(p01));
    }
}
