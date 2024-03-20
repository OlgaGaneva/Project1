package org.example;

public class codingTask4 {
    public static void main(String[] args) {
        int[][] numbers= {
                {64, 60, 77, 63},
                {5, 2, 44, 66},
                {15, 64, 23,88}
        };
            int sumEven=0;
            int sumOdd=0;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 4; j++) {
                if (numbers[i][j]%2 == 0){
                    sumEven=sumEven+numbers[i][j];
                }if(numbers[i][j]%2==1){
                    sumOdd=sumOdd+numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is "+sumEven);
        System.out.print("The sum of odd numbers is "+sumOdd);
    }
}
//4.	Create a 2D array of integers. Develop a program which will calculate the sum of
// even and odd numbers for that array.



