package com.yang.J2SE.ToolsTwo.testobject;

public class TestObject02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        House house = new House();
        house.name="李湘东";
        house.id=1;
        house.money=10000000;

        House house2 = (House) house.clone();
        System.out.println(house==house2);
        System.out.println(house.equals(house2));
    }
}
