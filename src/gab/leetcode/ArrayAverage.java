package gab.leetcode;

public class ArrayAverage {


//Problem: Write a Java program to calculate the average of a list of integers.
//
//Hint: To calculate the average, you can add up all the integers in the list and divide the result by the number of integers in the list.


    public static void main(String[] args){
        int[] test = {45,25,32,15,26};

        System.out.println(getAverage(test));


    }

    public static float getAverage(int[] nums){
        float sum = 0;
        for(int i = 0; i <= nums.length -1 ; i++){
            sum += nums[i];
        }
        return sum/nums.length;
    }
}
