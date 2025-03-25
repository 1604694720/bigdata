package homework;

import java.io.File;

public class Test3_24_4 {
    public static void main(String[] args) {
        File file = new File("D:/Test");
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for(File f:files){
                System.out.println(f.getName()+"=="+f.length()+"=="+f.getAbsolutePath());
            }
        }
    }
}
