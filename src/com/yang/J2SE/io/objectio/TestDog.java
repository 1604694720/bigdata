package com.yang.J2SE.io.objectio;

public class TestDog implements java.io.Serializable {
    String name;
    String color;
    int age;
    public TestDog() {
    }
    public TestDog(String name, String color, int age) {
        this.name=name;
        this.color=color;
        this.age=age;
    }

    @Override
    public String toString() {
        return "TestDog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
