public class Test01 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        int a = 10;
        int b = 0;
        int d = 1;
        do {
            b = a % 2 * d + b;
            a = a / 2;
            d=10*d;
        } while (a != 0);
        System.out.println(b);
    }
}
