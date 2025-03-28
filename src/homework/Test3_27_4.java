package homework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test3_27_4 {
    public static void main(String[] args){
        String[] student={"李湘东01","李湘东02","李湘东03","李湘东04","李湘东05","李湘东06","李湘东07","李湘东08","李湘东09","李湘东10"};
        ArrayBlockingQueue abq = new ArrayBlockingQueue<>(10);
        for (String str:student){
            abq.add(str);
        }
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(abq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
