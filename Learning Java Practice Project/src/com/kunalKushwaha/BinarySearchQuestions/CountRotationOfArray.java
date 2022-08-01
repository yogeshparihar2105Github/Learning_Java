package com.kunalKushwaha.BinarySearchQuestions;

public class CountRotationOfArray {

    public static void main(String[] args) {
        int[] arr = {7,8,9,2,3,4,5,6};

        System.out.println("Number of times the array is rotated : "+numberOfTimes_Rotated(arr));
    }

    public static int numberOfTimes_Rotated(int[] arr)
    {
        int count = findpivotElement_Index(arr);
        return count + 1;
    }

    public static int findpivotElement_Index(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        //checking from start to end and in the end only 1 element will be left therefore start = end 
        while(start <= end)
        {
            int mid = start + (end - start)/2; //more optimized
            //here 4 cases will be there

            //case 1 :
            if(mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            //case 2 :
            if(mid > start && arr[mid] < arr[mid - 1])
            {
                return mid - 1;
            }
            //case 3 :
            if(arr[mid] <= arr[start])
            {
                end = mid - 1;
            }
            // case 4 : 
            else //arr[mid] > arr[start]
            {
                start = mid + 1;
            }
        }    
        return -1;
    }
}
