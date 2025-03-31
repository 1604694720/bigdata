package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Test3_31_2 {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(1001,"李湘东","清洁工",3000,1000));
        arrayList.add(new Employee(1001,"彭正宇","保安",5000,500));
        arrayList.add(new Employee(1001,"李涛","码农",10000,2000));
        arrayList.add(new Employee(1001,"张俊","保洁",4000,3000));
        arrayList.sort((employee01,employee02)->employee01.salary>employee02.salary?1:-1);
        System.out.println(arrayList);
        arrayList.sort((employee01,employee02)->employee01.subidy>employee02.subidy?1:-1);
        System.out.println(arrayList);
    }
    static class Employee{
        int code;
        String name;
        String job;
        int salary;
        int subidy;

        public Employee(int code, String name, String job, int salary, int subidy) {
            this.code = code;
            this.name = name;
            this.job = job;
            this.salary = salary;
            this.subidy = subidy;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "code=" + code +
                    ", name='" + name + '\'' +
                    ", job='" + job + '\'' +
                    ", salary=" + salary +
                    ", subidy=" + subidy +
                    '}';
        }
    }
}

