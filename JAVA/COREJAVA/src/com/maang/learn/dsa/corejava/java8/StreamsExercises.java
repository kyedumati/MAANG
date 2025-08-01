package com.maang.learn.dsa.corejava.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExercises {
    static List<Employee> employeeList = new ArrayList<Employee>();
    static {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    }

    public static void main(String[] args) {
        // Query 1 : How many male and female employees are there in the organization?
        Map<String, Long> groupByGender = employeeList.stream().collect(Collectors.groupingBy(e-> e.getGender(), Collectors.counting()));
        System.out.println(groupByGender);
        // Query 2 : Print the name of all departments in the organization?
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(e-> System.out.println(e));
        //List<String> departments = employeeList.stream().map(Employee::getDepartment).collect(Collectors.toList());
        //departments.forEach(System.out::println);
        // Query 3 : What is the average age of male and female employees?
        Map<String, Double> averageAgeByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.averagingInt(Employee::getAge)));
        System.out.println("averageAgeByGender: "+ averageAgeByGender);

        // Query 4 : Get the details of highest paid employee in the organization?
        Optional<Employee> highestPaidEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println("highestPaidEmployee: "+ highestPaidEmployee);
        // Query 5 : Get the names of all employees who have joined after 2015?
        List<String> employeesAfter2015 = employeeList.stream().filter(p-> p.getYearOfJoining()>2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println("employeesAfter2015:"+ employeesAfter2015);
        // Query 6 : Count the number of employees in each department?
        Map<String, Long> countEmpsEachDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        printAnything(countEmpsEachDept);
        // Query 7 : What is the average salary of each department?
        Map<String, Double> avgSalaryEachDept = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        printAnything(avgSalaryEachDept);
        // Query 8 : Get the details of youngest male employee in the product development department?
        Optional<Employee> youngestEmployeeInProductDept=employeeList.stream().filter(e-> e.getGender().equalsIgnoreCase("Male")
                && e.getDepartment().equalsIgnoreCase("Product Development")).min(Comparator.comparingInt(Employee::getAge));
        printAnything(youngestEmployeeInProductDept);
        // Query 9 : Who has the most working experience in the organization?
        Optional<Employee> mostExpEmployee = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        printAnything(mostExpEmployee);
        // Query 10 : How many male and female employees are there in the sales and marketing team?
        Map<String, Long> maleFemaleEmpCount = employeeList.stream().filter(emp ->
                emp.getDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        printAnything(maleFemaleEmpCount);
        // Query 11 : What is the average salary of male and female employees?
        Map<String, Double> averageSalaryByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        printAnything(averageSalaryByGender);
        // Query 12 : List down the names of all employees in each department?
        Map<String, List<Employee>> empNamesInDept = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDepartment));
        // Query 13 : What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics summaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        printAnything(summaryStatistics.getAverage());
        printAnything(summaryStatistics.getSum());
        // Query 14 : Who is the oldest employee in the organization? What is his age
        // and which department he belongs to?
        Optional<Employee> oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        printAnything(oldestEmployee);


    }

    static void printAnything(Object object) {
        System.out.println(object);
    }

}
