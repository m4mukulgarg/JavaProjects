package com.github.m4mukulgarg.JavaProjects.BPITJavaLab;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        final int MAX = 100;
        int array[] = new int[MAX];
        System.out.println("Enter array elements (MAX = " + MAX + ")");

        int aElement;
        int n=0;
        while(true){
            aElement = Integer.parseInt(in.nextLine());
            if ((aElement == -1)||(n>99))
                break;
            array[n++] = aElement;
        }

        int i=0,temp;
        while (i<n/2){
            temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] =temp;
            i++;
        }

        for (int x=0; x<n; x++) {
            System.out.println(array[x]);
        }
    }
}
