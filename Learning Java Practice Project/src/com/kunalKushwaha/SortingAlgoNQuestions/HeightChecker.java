//Question : https://leetcode.com/problems/height-checker/submissions/812126374/

package com.kunalKushwaha.SortingAlgoNQuestions;

public class HeightChecker {
        public int heightChecker(int[] heights) {

            //copy the array before sorting
            int[] originalArray = new int[heights.length];

            for (int i = 0; i < originalArray.length; i++)
            {
                originalArray[i] = heights[i];
            }

            //sorting
            InsertionSort(heights);

            int counter = 0;

            //comparing both the arrays
            for(int i = 0; i<heights.length; i++)
            {
                if(heights[i] != originalArray[i])
                {
                    counter++;
                }
            }

            //returning the number of wrong indices
            return counter;
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

