package homework;

public class Test3_19_5 {
    public static void main(String[] args) {
        System.out.println(ss(7));
    }
    public static String ss(int a) {
        for (int i=2 ;i<=Math.sqrt(a); i++) {
            if(a%i==0) return "不是";
        }
        return "是";
    }
}
