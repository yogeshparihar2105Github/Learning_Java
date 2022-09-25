// CyclicSortAlgo -> check the first element and put it on it's correct index them move forward

package com.kunalKushwaha.SortingAlgoNQuestions.cyclicSort;

import java.util.Arrays;

public class CyclicSortAlgo
{
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void CyclicSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                Swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
    }
    public static void Swap(int[] arr, int firstNumber, int secondNumber)
    {
        int temp = arr[firstNumber];
        arr[firstNumber] = arr[secondNumber];
        arr[secondNumber] = temp;
    }

}
