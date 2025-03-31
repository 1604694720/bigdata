import homework.Plan;
import homework.ewmvc.box.Box;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Father obj = new Son();
        obj.get();
    }
}
class Father{
    public static void get(){
        System.out.println("father");
    }
}
class Son extends Father{
    public static void get(){
        System.out.println("son");
    }
}