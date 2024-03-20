package org.example;

public class codingTask8 {
    public static void main(String[] args) {

        int [] numbers={10,20,30,113,11};
        int max=numbers[0];
        int min=numbers[0];
        for (int i:numbers) {
            if(max<i){
                max=i;
            }
            for (int j:numbers){
                if(min>j){
                    min=j;
                }
            }
        }System.out.println("The max number is "+max+" and the min number is "+min);

        }
    }

//8.	Maximum and minimum number in the array?



