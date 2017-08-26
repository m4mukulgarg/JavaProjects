package com.github.m4mukulgarg.JavaProjects.BPITJavaLab;

public class StudentDemo {
    // demostration of construcors of class Student
    public static void main(String[] args) {

        Student mDefault = new Student();
        Student mParameter= new Student(420807216,"Mukul Garg");
        Student mCopy = new Student(mParameter);

        System.out.println(mDefault);
        System.out.println(mParameter);
        System.out.println(mCopy);
    }
}

