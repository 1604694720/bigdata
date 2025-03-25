package homework;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Test3_24_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒");
        String date = now.format(sdf);
        System.out.println("今天的日记：退出exists");
        while(true){
            a=sc.next();
            if (a.equalsIgnoreCase("exists"))
            {
               break;
            }
            try{
                set(date+"\n"+a+"\n","D:/日记.txt");
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
    public static void set(String sc,String seturl) throws IOException {
        FileWriter fos = null;
        fos = new FileWriter(seturl,true);
        fos.write(sc);
        if (fos != null) {
            fos.close();
        }
    }
}
