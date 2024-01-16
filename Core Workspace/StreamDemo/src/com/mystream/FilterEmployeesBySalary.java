package com.mystream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//program to get list of employees getting salary more than 20000  

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class FilterEmployeesBySalary {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ram", 25000));
        employees.add(new Employee("Shyam", 18000));
        employees.add(new Employee("Jai", 30000));
        employees.add(new Employee("Vijay", 22000));

        List<Employee> highPaidEmployees = employees.stream()
                .filter(employee -> employee.getSalary() > 20000)
                .collect(Collectors.toCollection(ArrayList::new));

        highPaidEmployees.forEach(
                     employee -> System.out.println(
                         employee.getName() + " - Salary: " + employee.getSalary())
                    );
    }
}
