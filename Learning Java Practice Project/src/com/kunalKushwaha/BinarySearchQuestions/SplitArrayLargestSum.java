//https://leetcode.com/problems/split-array-largest-sum/
//you have to find the largest sum of the sub array but the minimum among all the subarray

package com.kunalKushwaha.BinarySearchQuestions;

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;

        int minLargestSum = splitArray(nums, m);

        System.out.println(minLargestSum);
    }
    
    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            start = Math.max(start, nums[i]);
            end += nums[i];   
        }
        
        while(start < end)
        {
            //try for the mid as potential answer
            int mid = start + (end - start)/2;
            
            //calculate how many pecies you can divide with the max sum
            int sum = 0;
            int pieces = 1;
            
            for(int i = 0; i < nums.length; i++)
            {
                if(sum + nums[i] > mid)
                {
                    //you cannot add this in this subarray, make new one
                    //say you add this sum in new subarray, then sum = num
                    sum = nums[i];
                    pieces++;
                }
                else
                {
                    sum += nums[i];
                }
            }
            
            if(pieces > m)
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        
        return start; //because end == start in the end of the loop
    }
}
