//Question : https://leetcode.com/submissions/detail/808946213/

package com.kunalKushwaha.SortingAlgoNQuestions;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {

        int i = 0;

        while(i<nums.length)
        {
            int correctIndex = nums[i] -1;

            if(nums[i] != nums[correctIndex])
            {
                swap(nums, i, correctIndex);
            }
            else
            {
                i++;
            }
        }

        return nums[nums.length - 1];
    }

    public void swap(int[] a, int firstNumber, int secondNumber){
        int temp = a[firstNumber];
        a[firstNumber] = a[secondNumber];
        a[secondNumber] = temp;
    }
}
