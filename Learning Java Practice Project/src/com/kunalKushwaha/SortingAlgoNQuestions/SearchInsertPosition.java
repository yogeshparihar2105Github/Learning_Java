//Question : https://leetcode.com/submissions/detail/808772390/

package com.kunalKushwaha.SortingAlgoNQuestions;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(target<nums[mid])
            {
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
        return start;
    }
}
