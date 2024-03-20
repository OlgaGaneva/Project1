package org.example;

import java.util.Scanner;

public class codingTask7 {
    public static void main(String[] args) {
        int n=10;
        int num1=1;
        int num2=2;
        int nextNum;

        for (int i = 1; i <n; i++) {
            System.out.print(num1+" ");
            nextNum=num1+num2;
            num1=num2;
            num2=nextNum;

        }

    }
}
//7.	Write a Java Program to print the first 10 numbers of Fibonacci series.



