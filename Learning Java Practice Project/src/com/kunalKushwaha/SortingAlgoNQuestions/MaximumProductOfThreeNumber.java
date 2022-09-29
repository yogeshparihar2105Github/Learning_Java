//Question : https://leetcode.com/submissions/detail/811506335/

package com.kunalKushwaha.SortingAlgoNQuestions;

public class MaximumProductOfThreeNumber {
    public int maximumProduct(int[] nums) {
        InsertionSort(nums);
        int n = nums.length - 1;

        int product1 = 0;
        int product2 = 0;


        int mult = nums[0]*nums[1];

        product1 = nums[n]*mult;




        product2 = nums[n]*nums[n-1]*nums[n-2];



        if(product1>=product2)
        {
            return product1;
        }

        return product2;



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
