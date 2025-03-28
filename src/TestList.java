import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        List list = new List();
        list.adddata("a");
        list.adddata("b");
        list.adddata("c");
        String data = list.toString();
        System.out.println(data);
    }
}
