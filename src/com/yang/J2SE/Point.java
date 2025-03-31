package com.yang.J2SE;

public class Point {
    int X=0;
    int Y=0;
    int Z=0;

    public Point() {}
    public Point(int x) {X = x;}
    public Point(int x, int y) {X = x;Y = y;}
    public Point(int x, int y, int z) {X = x;Y = y;Z = z;}
    public void setX(int x) {
        X = x;
    }
    public void setY(int y) {
        Y = y;
    }
    public void setZ(int z) {
        Z = z;
    }
    public int pointyd(){
        return X*X+Y*Y+Z*Z;
    }
    public int pointqt(Point point){
        return (point.X-X)*(point.X-X)+(point.Y-Y)*(point.Y-Y)+(point.Z-Z)*(point.Z-Z);
    }
}
