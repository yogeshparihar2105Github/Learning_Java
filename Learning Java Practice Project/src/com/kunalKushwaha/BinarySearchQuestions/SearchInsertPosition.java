//Question : https://leetcode.com/problems/search-insert-position/


package com.kunalKushwaha.BinarySearchQuestions;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(target<nums[mid])
            {
                // we have to decrease it because if it is not decreased then time limit exceeds
                end = mid-1;
            }
            else if(target>nums[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }

        // we must have to return start because if we return end
        // it will be out of bound
        return start;
    }
}
