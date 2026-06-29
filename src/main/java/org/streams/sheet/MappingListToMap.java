package org.streams.sheet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingListToMap {

    static class Employee {

        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    static class Employee1 {

        private int id;
        private String name;
        private String department;
        private double salary;

        // Constructor
        // Getters

        public Employee1(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int getId() {

            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }

    void main() {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", 50000),
                new Employee(102, "Alice", 60000),
                new Employee(103, "Bob", 70000)
        );

        Map<Integer, Employee> eMap = employees.stream().collect(Collectors.toMap(e -> e.id, e -> e));



        List<Employee1> employees1 = Arrays.asList(
                new Employee1(101, "John", "IT", 50000),
                new Employee1(102, "Alice", "HR", 60000),
                new Employee1(103, "Bob", "IT", 70000),
                new Employee1(104, "David", "HR", 40000),
                new Employee1(105, "Mike", "Finance", 80000)
        );

        Map<String, Double> sMap = employees1.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.summingDouble(Employee1::getSalary)));

    }
}
