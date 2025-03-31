package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test3_31_1 {
    public static void main(String[] args) {
//        列表
        ArrayList<Dog> dogList = new ArrayList<>();
//        添加
        dogList.add(new Dog("煌煌", 170, 21));
        dogList.add(new Dog("成成", 140, 20));
        dogList.add(new Dog("浩浩", 150, 19));
        dogList.add(new Dog("小易", 160, 18));
        dogList.add(new Dog("帅总", 130, 35));

//        排序
        Collections.sort(dogList,(Dog dog1, Dog dog2)-> (dog1.age <= dog2.age)?0:-1);
//        再简化
//        dogList.sort((Dog dog1, Dog dog2)-> (dog1.age>dog2.age)?1:-1);
        System.out.println(dogList);
    }
}
class Dog{
    String name;
    int weight;
    int age;

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
