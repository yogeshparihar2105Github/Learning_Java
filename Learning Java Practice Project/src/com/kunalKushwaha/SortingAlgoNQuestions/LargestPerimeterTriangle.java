//Question : https://leetcode.com/problems/largest-perimeter-triangle/description/

package com.kunalKushwaha.SortingAlgoNQuestions;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {

        InsertionSort(nums);

        for(int i=nums.length-1;i>=2;i--)
        {
            // here i is the biggest
            // if you add two smaller and that sum is bigger than the
            // the third number (which is the biggest)
            // you don't need to check the other two conditions
            if(nums[i-1]+nums[i-2]>nums[i])
            {
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
    public static void InsertionSort(int[] arr)
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

    public static void Swap(int[] a, int firstIndex, int secondIndex)
    {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }
}
