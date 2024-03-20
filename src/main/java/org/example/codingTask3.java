package org.example;

public class codingTask3 {
    public static void main(String[] args) {
        int[][] numbers= {
                {64, 60, 77, 63, 72, 68, 11},
                {5, 2, 44, 66, 70, 6, 10},
                {15, 64, 23, 336, 76, 62, 10}
        };

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 7; j++) {
                if (numbers[i][j]%2 == 0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();

        }

    }
}




