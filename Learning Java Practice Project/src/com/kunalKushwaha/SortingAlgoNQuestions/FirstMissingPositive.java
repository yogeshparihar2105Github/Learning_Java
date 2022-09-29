//Question : https://leetcode.com/submissions/detail/810371129/

package com.kunalKushwaha.SortingAlgoNQuestions;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        //Cyclic Sort
        int i = 0;
        while(i < nums.length)
        {
            int correctIndex = nums[i] -1;

            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIndex])
            {
                //swapping
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else
            {
                i++;
            }
        }

        //serching the first positive missing number
        for(int j =0;j<nums.length;j++)


        {
            if(nums[j] != j + 1)
            {
                return j + 1;
            }
        }

        return nums.length + 1;


    }
}
