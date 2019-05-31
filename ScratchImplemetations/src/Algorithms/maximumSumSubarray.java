package Algorithms;

/**
 * maximumSumSubarray
 * Given an integer array nums, 
 * find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.
 */
public class maximumSumSubarray {

    public static void main(String[] args) {
        int[] steve = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("The maximum sum is "+ findMaxSubArray(steve));
    }

    public static int findMaxSubArray(int[] nums) {
        int sumNow = 0;
        int sumMax = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sumNow=sumNow+nums[i];
            if (sumNow < 0) {
                sumNow=0;
            }
            if (sumNow >sumMax) {
                sumMax=sumNow;
            }
        }
        return sumMax;
    }
}