import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int b = 9;
        String str = "";
        while (b != 0) {
            str = b%2+str;
            b = b/2;
        }
        System.out.println(str);
    }
}
