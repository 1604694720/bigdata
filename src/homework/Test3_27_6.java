package homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3_27_6 {
    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("D:/City.txt");
            BufferedReader br = new BufferedReader(fr);
            String str=null;
            HashMap<String,String> citys= new HashMap<>();
            while((str=br.readLine())!=null){
                str = str.replace("、","，");
                String[] city = str.split("，");
                citys.put(city[1],city[3]);
            }
            fr.close();
            br.close();
            Set<String> strings = citys.keySet();
            strings.forEach(System.out::println);
            Set<Map.Entry<String, String>> entries = citys.entrySet();
            for (Map.Entry<String, String> entry:entries){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
