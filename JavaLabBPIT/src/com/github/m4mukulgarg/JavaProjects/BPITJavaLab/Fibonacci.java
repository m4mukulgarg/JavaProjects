package com.github.m4mukulgarg.JavaProjects.BPITJavaLab;

import java.io.PrintStream;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        PrintStream out = System.out;
        System.out.println("Enter no. of elements:");
        Scanner input = new Scanner(System.in);
        int a = 0, b = 1, c, n = input.nextInt();

        for(int i=0; i<n; i++){
            switch(i){
                case 0 :
                    out.println(1);
                    break;
                default:
                    c = a+b;
                    out.println(c);
                    a = b;
                    b = c;
                    break;
            }
        }
    }
}
