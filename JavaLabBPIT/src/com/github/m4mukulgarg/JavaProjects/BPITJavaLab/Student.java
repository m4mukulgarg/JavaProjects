package com.github.m4mukulgarg.JavaProjects.BPITJavaLab;

//Class Student contains multiple contructors

public class Student {

    long examNum;
    String name;

    //default constructor
    Student(){ }

    //Parameterized constructor
    Student(long examNum, String name){
        this.examNum = examNum;
        this.name = name;
    }

    //Parameterized copy constructor
    Student(Student student){
        this.examNum = student.examNum;
        this.name = student.name;
    }

    @Override
    public String toString() {
        return  "examNum=" + examNum +
                ", name='" + name + '\'';
    }
}
