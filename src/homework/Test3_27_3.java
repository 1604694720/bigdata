package homework;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test3_27_3 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"李湘东","傻逼",250,38, LocalDate.EPOCH));
        list.add(new Employee(2,"李向东","傻逼",2500,308, LocalDate.EPOCH));
        list.add(new Employee(3,"李想动","傻逼",25000,38, LocalDate.EPOCH));
        list.add(new Employee(4,"李相等","傻逼",3050,608, LocalDate.EPOCH));
        list.add(new Employee(6,"李祥东","傻逼",10000,3000, LocalDate.EPOCH));
        Employee.print(list);
        Employee.printSalary(list);
    }
}
