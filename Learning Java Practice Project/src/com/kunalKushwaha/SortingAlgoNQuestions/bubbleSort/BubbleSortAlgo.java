// Bubble Sort -> sort the adjacent values 

package com.kunalKushwaha.SortingAlgoNQuestions.bubbleSort;

public class BubbleSortAlgo {
    public static void main(String[] args) 
    {      
        int[] arr = {1,2,3,4,5};
        
        bubbleSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] a)
    {
        boolean swapped = false;
        // going up to the end of the array because we have to run the loop n times
        // where n is number elements in the array
        for(int i = 0; i <= a.length - 1; i++)
        {
            // since biggest element in the array will be sorted 
            // everytime when the below loop runs 
            // hence we can run the loop upto (n - i) only
            // where n is the last index of array
            for(int j = 1; j <= a.length - 1 - i; j++)
            {
                // checking the biggest number and swap the position
                // you have to put the (j-1) element to (j)
                // so that biggest element comes to the last index of array
                if(a[j] < a[j-1])
                {
                    // swapping
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;

                // FOR OPTIMIZATION PURPOSE                    
                    // if no swapping is done in i = 0 iteration 
                    // that means the array is sorted and
                    // we don't need to check for the remaining iteration of i 
                    swapped = true;
                }
            }
            if(!swapped)
            {
                // breaking out the loop once i = 0 is run and no swapping happens
                break;
            }
        }
    }
}
