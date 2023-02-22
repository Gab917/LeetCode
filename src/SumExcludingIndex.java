public class SumExcludingIndex {

    public static void main(String[] args){
        int[] input = {1,2,3,4};
        int[] test = sum(input);

        for (int num: test){
            System.out.println(num + " ");
        }

    }
    //Here's another sample problem from TestGorilla:
    //
    //Problem: Write a Java program that takes an array of integers and returns a
    // new array where each element is the sum of all the elements in the input array
    // except for the element at the current index.

    //For example, if the input array is [1, 2, 3, 4], the output array would be [9, 8, 7, 6].
    //Can you write a Java program to solve this problem?

    public static int[] sum(int[] nums){
        int[] result = new int[nums.length];
        for(int i=0; i <= nums.length -1 ; i++){
            for(int j = 0; j <= nums.length- 1; j++){
                if(i != j){
                    result[i] += nums[j];
                }
            }
        }
        return result;
    }


}
