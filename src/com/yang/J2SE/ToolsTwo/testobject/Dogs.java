package com.yang.J2SE.ToolsTwo.testobject;

//未写明继承什么类，默认继承Object类。
public class Dogs {
    String dogname;
    int age;
    int ID;

//    对父类方法equals()的重写。
    public boolean equals(Object obj) {
//        需要把obj的类型Object强转为Dogs。
        Dogs dogs = (Dogs)obj;
        return (this.dogname==dogs.dogname&&this.age==dogs.age&&this.ID==dogs.ID);
    }
}
