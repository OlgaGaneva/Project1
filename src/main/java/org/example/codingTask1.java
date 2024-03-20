package org.example;

public class codingTask1 {
    public static void main(String[] args) {
        int [] temp={64,69,71,66,70,67,65};
        int high=temp[0];
        for(int i:temp){
            if(high<i){
                high=i;
           }
            }
        int low=temp[0];
        for(int i:temp)
        if(low>i){
            low=i;
        }System.out.println("The highest temperature for this week is "+high);
        System.out.println("The lowest temperature for this week is "+low);

        }



        }



