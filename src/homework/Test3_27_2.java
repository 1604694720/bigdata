package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3_27_2 {
    public static void main(String[] args) {
        String str = "aa@sohu.com,bb@163.com,cc@sina.com";
        String[] list = str.split(",");
        HashMap<String,String> hashMap = new HashMap();
        for (String email:list){
            hashMap.put(email.split("@")[0],email.split("@")[1]);
        }
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry:entries){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
