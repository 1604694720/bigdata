package homework;

import com.yang.J2SE.exception.NameLengthException;

import java.util.Scanner;

public class Test3_21_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int age = sc.nextInt();
            if (age < 18) {
                System.out.println("年龄小于18岁，需要重新输入");
                continue;
            }
            String name = sc.next();
            try {if (name.length()>5){
                throw new NameLengthException();
            }
            }catch (NameLengthException e) {
                e.printStackTrace();
            }finally {
                break;
            }
        }
    }
}
