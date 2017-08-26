package com.github.m4mukulgarg.JavaProjects.BPITJavaLab;

public class CommandLineArgs {
    public static void main(String[] args) {
        switch (args[0]){
            case "f":
                System.out.println("Entering Fibonacci.main()");
                Fibonacci.main(null);
                break;
            case "r":
                System.out.println("Entering ReverseArray.main()");
                ReverseArray.main(null);
                break;
        }
    }
}
