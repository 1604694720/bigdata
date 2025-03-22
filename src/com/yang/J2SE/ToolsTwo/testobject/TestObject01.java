package com.yang.J2SE.ToolsTwo.testobject;

public class TestObject01 {
    public static void main(String[] args) {
        Dogs dog01 = new Dogs();
        dog01.dogname="李湘东";
        dog01.age=8;
        dog01.ID=1;

        Dogs dog02 = dog01;
        dog02.age=18;
//        复制地址，dog02修改dog01也会变化。
        System.out.println(dog01.age);

        dog01.age=8;
        Dogs dog03 = new Dogs();
        dog03.dogname="李湘东";
        dog03.age=8;
        dog03.ID=1;
//        地址比较，因为地址不同，所以得到false。
        System.out.println(dog01 == dog03);
//        未重写equals()，默认比较地址。
        System.out.println(dog01.equals(dog03));
    }
}
