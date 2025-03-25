package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test3_25_3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Program Files\\QQ我的文档\\联系电话_数据.txt");
        BufferedReader br= new BufferedReader(fr);
        String line = null;
        while ((line=(br.readLine()))!=null){
            String[] str= line.split("\t");
            for (int i = 0;i<str.length;i++){
                if(str[i].equals("副主席")){
                    System.out.println(str[i+2]);
                }
            }
        }
    }
}
