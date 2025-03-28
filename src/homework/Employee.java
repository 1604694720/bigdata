package homework;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {
    int cod;
    String name;
    String job;
    int salary;
    int subsidy;
    LocalDate engtryTime;

    public Employee(int cod, String name, String job, int salary, int subsidy, LocalDate engtryTime) {
        this.cod = cod;
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.subsidy = subsidy;
        this.engtryTime = engtryTime;
    }
    public static void print(ArrayList<Employee> list){
        for(Employee employee:list){
            System.out.println(employee);
        }
    }
    public static void printSalary(ArrayList<Employee> list){
        for(Employee employee:list){
            if (employee.salary<5000){
                System.out.println(employee);
            }
        }
    }
    @Override
    public String toString() {
        return "Employee{" +
                "cod=" + cod +
                ", job='" + job + '\'' +
                ", salary==" + salary +
                ", subsidy=" + subsidy +
                '}';
    }
}
