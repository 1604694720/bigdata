package homework;

import java.io.*;

public class Test3_25_1 {
    public static void main(String[] args) throws IOException {
        FileReader fis = new FileReader("D:\\Program Files\\QQ我的文档\\诺言.lrc");
        BufferedReader br = new BufferedReader(fis);
        String line = null;
        int index = 0;
        int count=0;
        while((line=br.readLine())!=null){
            count+=line.length();
            System.out.println(line);
            index++;
        }
        System.out.println(count);
        System.out.println(index);
    }
}
