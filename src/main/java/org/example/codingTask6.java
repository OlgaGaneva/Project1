package org.example;

import java.util.Scanner;

public class codingTask6 {
    public static void main(String[] args) {

        int num =9;
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (num <= 1) {
            isPrime = false;
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}





//6.	Write a java program to check whether a given number is prime or not?



