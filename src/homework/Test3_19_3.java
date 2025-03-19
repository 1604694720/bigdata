package homework;

public class Test3_19_3 {
    public static void main(String[] args) {
        System.out.println(abs(-2));
        System.out.println(max(2, 4));
        System.out.println(min(2, 4));
        System.out.println(area(1.1));
        System.out.println(volume(1.1, 1.0));
    }
    public static int abs(int a) {
        return a<0?-a:a;
    }
    public static int max(int a, int b) {
        return a>b?a:b;
    }
    public static int min(int a, int b) {
        return a>b?b:a;
    }
    public static double area(double radius) {
        return radius*radius*Math.PI;
    }
    public static double volume(double radius, double height) {
        return radius*radius*Math.PI*height;
    }
}
