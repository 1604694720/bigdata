package homework;

import java.io.*;

public class Test3_24_1 {
    public static void main(String[] args) {
//        try{
//            copy("D:\\Test.jpg","D:/Test/Test.jpg");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        try{
            cut("D:/Test/Test.png","D:/Test.png");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void copy(String geturl,String seturl) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        fis = new FileInputStream(geturl);
        fos = new FileOutputStream(seturl);
        int a;
        while((a=fis.read())!=-1){
            fos.write(a);
        }
        fis.close();
        if (fos != null) {
            fos.close();
        }
    }
    public static void cut(String geturl,String seturl) throws IOException {
        copy(geturl,seturl);
        File file = new File(geturl);
        file.delete();
    }
}
