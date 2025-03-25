package homework;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Test3_25_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/Test");
        if (file.isDirectory()){
            File[] files = file.listFiles();
            Vector vector = new Vector();
            for(File f:files){
                vector.addElement(new FileInputStream(f));
            }
            SequenceInputStream sis = new SequenceInputStream(vector.elements());
            int a = -1;
            while((a=sis.read())!=-1){
                System.out.print((char) a);
            }
        }
    }
}
