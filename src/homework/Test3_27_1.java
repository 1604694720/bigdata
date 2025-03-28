package homework;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3_27_1 {
    public static void main(String[] args) {
        Books book01 = new Books("1001","查理六世",25,"我出版的");
        Books book02 = new Books("1002","查理七世",26,"我出版的");
        Books book03 = new Books("1003","查理八世",35,"我出版的");
        Books book04 = new Books("1004","查理九世",20,"我出版的");
        HashMap<String,Books> books = new HashMap();
        books.put(book01.id,book01);
        books.put(book02.id,book02);
        books.put(book03.id,book03);
        books.put(book04.id,book04);
        books.remove("1001");
        Set<Map.Entry<String, Books>> entries = books.entrySet();
        for (Map.Entry<String,Books> entry : entries){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println(books.get("1002"));
    }
}
