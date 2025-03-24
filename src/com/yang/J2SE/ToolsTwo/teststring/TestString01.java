package com.yang.J2SE.ToolsTwo.teststring;

public class TestString01 {
    public static void main(String[] args) {
        String str01 = new String();
        String str02 = new String("周末没有作业");
        System.out.println(str02);

        char[] chars = {'a','b','c'};
        String str03 = new String(chars);
        System.out.println(str03);

//        =========0  A   a
        byte[] buf = {48,65,97};
        String str04 = new String(buf);
        System.out.println(str04);

//        只取2个 0-2,左边取到，右边取不到。
        String str05 = new String(buf,0,2);
        System.out.println(str05);
    }
}
