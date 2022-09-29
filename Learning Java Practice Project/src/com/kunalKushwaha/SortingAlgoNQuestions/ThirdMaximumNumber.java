//Question : https://leetcode.com/submissions/detail/811473170/
package com.kunalKushwaha.SortingAlgoNQuestions;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        InsertionSort(nums);

        int n = nums.length - 1;
        int firstMax = nums[n];
        int maxCount = 1;
        int i = n;
        while(i>0)
        {
            if(nums[i-1] < nums[i])
            {
                maxCount++;
                if(maxCount == 3)
                {
                    return nums[i-1];
                }
                i--;

            }
            else
            {
                i--;
            }
        }

        return firstMax;
    }

    public void InsertionSort(int[] arr)
    {
        // i will go upto only n-2 where n is no. of elements in array
        for(int i = 0; i < arr.length - 1; i++)
        {
            // j will start from i+1 and then decrement it to 0 each time
            for(int j = i+1; j>0; j--)
            {
                // if j-1 is greater than j then we should swap the two
                if(arr[j] < arr[j-1])
                {
                    Swap(arr, j, j-1);
                }
                // if j-1 is less than j that means the element is on it's correct location
                // hence we can break from the loop
                else
                {
                    break;
                }
            }
        }
    }

    public void Swap(int[] a, int firstIndex, int secondIndex)
    {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }
}
