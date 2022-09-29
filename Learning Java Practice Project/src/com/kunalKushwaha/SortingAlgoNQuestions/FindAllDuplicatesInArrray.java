//Question : https://leetcode.com/submissions/detail/809604914/

package com.kunalKushwaha.SortingAlgoNQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArrray {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();

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
                list.add(nums[j]);
                j++;
            }
            else
            {
                j++;
            }
        }
        return list;
    }
}
