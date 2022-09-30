//Question : https://leetcode.com/problems/squares-of-a-sorted-array/submissions/812121807/

package com.kunalKushwaha.SortingAlgoNQuestions;

public class SquaresOfSortedArray {

        public int[] sortedSquares(int[] nums) {

            //squaring
            for(int i =0 ; i< nums.length;i++)
            {
                nums[i]= nums[i]*nums[i];
            }

            InsertionSort(nums);

            return nums;
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

