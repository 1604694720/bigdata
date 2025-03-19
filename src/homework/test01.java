package homework;

public class test01 {
    public static void main(String[] args) {
        int a=1;
        int b = 1;
        int d=1;
        double c=0.00;
        for (int i = 1; i <= 20; i++) {
            d=a+b;
            a=b;
            b=d;
            System.out.println(a+","+d);
            c=c+(double)a/b;
        }
        System.out.println(c);
    }
}
