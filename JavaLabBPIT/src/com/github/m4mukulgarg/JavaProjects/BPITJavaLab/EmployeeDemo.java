package com.github.m4mukulgarg.JavaProjects.BPITJavaLab;

public class EmployeeDemo {
    // demostration of construcors of class Student
    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println(employee);

        employee.setVal(7216);
        System.out.println(employee);

        employee.setVal("Jane Doe");
        System.out.println(employee);

        employee.setVal(1672, "John Doe");
        System.out.println(employee);
    }
}
