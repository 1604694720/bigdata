import java.io.FileNotFoundException;
//10转二进制的算法练习
public class Test02 {
    public static void main(String[] args) {
        System.out.println(test(10));
    }
    public static int test(int a){
        return a/2==0?a%2:test(a/2)*10+a%2;
    }
}
