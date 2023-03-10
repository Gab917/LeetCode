package gab.leetcode;

import java.util.Arrays;

public class ProductArray {

    public static void main(String[] args){
        int[] xd = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(xd)));
    }

    public static int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0; i <= nums.length-1;i++){
            result[i] = 1;
            for(int j = 0; j <= nums.length-1;j++){
                if(i != j){
                        result[i] *= nums[j];
                }
            }
        }
        return result;
    }
}
