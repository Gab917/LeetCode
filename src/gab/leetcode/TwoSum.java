package gab.leetcode;/*



Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.


 */

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {// outer loop as index i
            for(int j=i+1;j<nums.length;j++){// inner loop as index j
                if (nums[i]+nums[j] == target){ // checks if sum of the values from both index are equal to target number
                    return new int[]{i, j};
                }

            }
        }
        return null; //returns null if loop finishes without getting the value of TwoSums
    }
}