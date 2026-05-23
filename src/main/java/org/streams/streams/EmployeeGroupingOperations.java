package org.streams.streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class EmployeeGroupingOperations {

    static class Employee {
        String name;
        int deptId;
        double salary;
        String gender;

        public Employee(String name, int deptId, double salary, String gender) {
            this.name = name;
            this.deptId = deptId;
            this.salary = salary;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public int getDeptId() {
            return deptId;
        }

        public double getSalary() {
            return salary;
        }

        public String getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", deptId=" + deptId +
                    ", salary=" + salary +
                    ", gender='" + gender +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("a", 1, 1400.00, "M"));
        employees.add(new Employee("b", 2, 1500.00, "F"));
        employees.add(new Employee("bb", 2, 1600, "M"));
        employees.add(new Employee("bcd", 2, 1700, "F"));
        employees.add(new Employee("bb", 1, 1800, "M"));


        //Grouping
        Map<Integer, List<Employee>> map = employees.stream().collect(groupingBy(Employee::getDeptId));
        System.out.println(map);

        //Counting
        Map<Integer, Long> map2 = employees.stream().collect(groupingBy(Employee::getDeptId, Collectors.counting()));
        System.out.println(map2);

        //Average Salary Each Department
        Map<Integer, Double> map3 = employees.stream().collect(groupingBy(Employee::getDeptId, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map3);

        //HighestSalary Employee Each Dept
        Map<Integer, Optional<Employee>> map4 = employees.stream().collect(groupingBy(Employee::getDeptId, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(map4);

        //cascadinGrouping
        Map<Integer, Map<String, List<Employee>>> map5 =
                employees.stream().collect(groupingBy(Employee::getDeptId, groupingBy(Employee::getGender)));

        System.out.println(map5);

    }
}
