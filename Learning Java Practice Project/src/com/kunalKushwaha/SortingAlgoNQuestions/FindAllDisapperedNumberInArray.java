//Question : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package com.kunalKushwaha.SortingAlgoNQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisapperedNumberInArray {

    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        // cyclic Sort
        int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct])
            {
                Swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        // finding missing numbers
        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] != index + 1)
            {
                ans.add(index + 1);
            }
        }

        return ans;

    }

    public static void Swap(int[] arr, int firstNumber, int secondNumber)
    {
        int temp = arr[firstNumber];
        arr[firstNumber] = arr[secondNumber];
        arr[secondNumber] = temp;
    }
}
