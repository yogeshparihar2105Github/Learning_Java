// SelectionSort -> Select the maximum/minimum and put it at it's correct index

package com.kunalKushwaha.SortingAlgoNQuestions.SelectionSort;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};

        selectionSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    // we have to make it static because we want to use it in the same class 
    // without making an object of it and referecing this through the object
    public static void selectionSort(int[] a)
    {
        // go through the array from 0 to end
        // get the last index, everytime when i increases the maximum element will be sorted
        // hence you can skip the last index in the next iteration
        for(int i = 0; i <= a.length - 1; i++)
        {
            // the following line calculate the last index in each iteration
            // every iteration lastIndex is decreasing by 1 
            // because we have sorted that number
            int lastIndex = a.length - 1 - i;

            // the following will store the index of the maximum number in the array
            int maxIndex = getMaxNumberIndex(a, 0, lastIndex);

            // the following function will swap the maximum number with it's correct index
            swapTwoNumbers(a, maxIndex, lastIndex);
        }
    }

    // it will find the maximum number in an array from index start to last
    // by using linear search algo
    public static int getMaxNumberIndex(int[] a, int start, int last)
    {
        int maxIndex = start;

        for(int i = start; i <= last; i++)
        {
            if(a[maxIndex] < a[i])
            {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    // the following will swap the two numbers in the array
    public static void swapTwoNumbers(int[] a, int firstIndex, int secondIndex)
    {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }

}
