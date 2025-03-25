package com.yang.J2SE.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        File dir = new File("D:\\KuGou");
        if (dir.isDirectory()){
//            增强for循环
//            for (File file : dir.listFiles()){
//                System.out.println(file.getName());
//            }
//            File[] files = dir.listFiles(new FilenameFilter() {
//                @Override
//                public boolean accept(File dir, String name) {
//                    return name.endsWith("mp3");
////                    endsWith()返回boolean类型
//                }
                File[] files = dir.listFiles();
            for (int i = 0 ; i < files.length ; i++){
                System.out.print((i+1) +"."+ files[i].getName());
                if(i%5==0){
                    System.out.println();
                }
            }
            Thread thread = null;
            thread = new Thread(){
                @Override
                public void run() {
                    System.out.println("000");
                }
            };
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入歌曲索引");
            int index = sc.nextInt();
            System.out.println("正在播放：" + files[index]);
            thread.start();
        }
    }
}
