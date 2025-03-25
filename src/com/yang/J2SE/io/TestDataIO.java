package com.yang.J2SE.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataIO {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data/data.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(100);
        dos.writeByte(10);
        dos.writeChar('狗');
        fos.close();
        dos.close();
    }

}
