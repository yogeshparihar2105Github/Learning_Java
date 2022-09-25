package com.kunalKushwaha.SortingAlgoNQuestions;

public class MissingNumber {
    public static void main(String[] args)
    {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums)
    {
        //Cyclic Sort
        int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct])
            {
                Swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }

        //searching for the missing number
        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] != index)
            {
                return index;
            }
        }

        //case 2
        return nums.length;

    }

    public static void Swap(int[] arr, int firstNumber, int secondNumber)
    {
        int temp = arr[firstNumber];
        arr[firstNumber] = arr[secondNumber];
        arr[secondNumber] = temp;
    }
}
