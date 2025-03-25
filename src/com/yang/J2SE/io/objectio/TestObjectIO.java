package com.yang.J2SE.io.objectio;

import java.io.*;

public class TestObjectIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestDog dog = new TestDog("李湘东","黑色",18);
        testWriteObj(dog);
        testReadObj();
    }

    private static void testReadObj() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("data/dog.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject().toString());
        fis.close();
        ois.close();
    }

    private static void testWriteObj(TestDog dog) throws IOException {
        FileOutputStream fis = new FileOutputStream("data/dog.txt");
//        输出流 结点流【与数据打交道】
        ObjectOutputStream oos = new ObjectOutputStream(fis);
//        处理流【增强功能】基本结点
        oos.writeObject(dog);
//        进行序列化 将对象按规则进行存储
//        关闭
        fis.close();
        oos.close();
    }
}
