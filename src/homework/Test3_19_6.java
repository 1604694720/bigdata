package homework;

public class Test3_19_6 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (ss(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean ss(int a){
        for (int j = 2; j <= Math.sqrt(a); j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }
}
