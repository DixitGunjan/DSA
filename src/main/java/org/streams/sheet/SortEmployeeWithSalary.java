package org.streams.sheet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeWithSalary {
    static class Employee{
        int id;
        double salary;
        String name;
        public Employee(int id, double salary, String name) {
            this.id = id;
            this.salary = salary;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public double getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
        }
    }
    public static void main(String[] args) {

        SortEmployeeWithSalary.Employee e1 = new Employee(1, 2500.0f, "Ajnabee");
        SortEmployeeWithSalary.Employee e2 = new Employee(1, 4500.0f, "BAjnabee");
        SortEmployeeWithSalary.Employee e3 = new Employee(1, 3500.0f, "CAjnabee");
        SortEmployeeWithSalary.Employee e4 = new Employee(1, 5500.0f, "DAjnabee");

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

        List<Employee> result = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(result);

    }
}
