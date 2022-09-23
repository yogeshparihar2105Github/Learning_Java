// InsertionSortAlgo -> sort the first two then take the third and  
// Insert it at it's correct location

package com.kunalKushwaha.SortingAlgoNQuestions.insertionSort;

public class InsertionSortAlgo {

    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};

        InsertionSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
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
