package org.example;

public class codingTask9 {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 3, 30, 15, 11};
        int max = numbers[0];
        int secMax = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }if (max > numbers[i] && numbers[i] > secMax) {
                secMax = numbers[i];
            }
        }
        System.out.println("The second max number is " + secMax);
    }
}



//9.	Write a java program to find the second largest number in the array?



