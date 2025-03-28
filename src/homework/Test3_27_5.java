package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test3_27_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] student={"李湘东01","李湘东02","李湘东03","李湘东04","李湘东05","李湘东06","李湘东07","李湘东08","李湘东09","李湘东10"};
        list.addAll(List.of(student));
        Collections.shuffle(list);
        System.out.println(list.getFirst());
    }
}
