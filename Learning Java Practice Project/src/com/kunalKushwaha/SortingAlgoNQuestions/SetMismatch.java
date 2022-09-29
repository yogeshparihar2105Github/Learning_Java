//Question : https://leetcode.com/submissions/detail/809618837/

package com.kunalKushwaha.SortingAlgoNQuestions;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {

        int[] list = new int[2];
        //Apply Cyclic Sort
        int i = 0;

        while(i<nums.length)
        {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex])
            {
                //swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else
            {
                i++;
            }
        }

        //checking and adding in the list
        int j = 0;
        while(j<nums.length)
        {
            if(nums[j] != j + 1)
            {
                list[0] = nums[j];
                list[1] = j+1;

                return list;
            }
            else
            {
                j++;
            }
        }
        return list;
    }
}
