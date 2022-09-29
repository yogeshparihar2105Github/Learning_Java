//Question : https://leetcode.com/problems/assign-cookies/

package com.kunalKushwaha.SortingAlgoNQuestions;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        //Apply BubbleSort
        InsertionSort(g);
        InsertionSort(s);

        int i = 0;
        int j = 0;

        int max = 0;

        while(i < g.length && j < s.length)
        {
            if(s[j] >= g[i])
            {
                max++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }

        return max;

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
