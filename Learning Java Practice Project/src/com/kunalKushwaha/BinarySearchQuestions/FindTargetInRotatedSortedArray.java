package com.kunalKushwaha.BinarySearchQuestions;

//the array is sorted but rotated from the pivot(i.e. peak element or highest element)
//Find peak element first
//then apply binary search from start = 0 to peak
//and start = peak + 1 to end 
//You will get the answer

public class FindTargetInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 5;

        //Find Peak
        int peak = findPeakElement_Index(arr);
        int end = arr.length - 1;
        //apply binary search from start = 0 to peak
        int index1OfTarget = SearchInRangeUsingBinarySearch(arr, target, 0, peak);

        if(index1OfTarget == -1)
        {
            //and start = peak + 1 to end
            int index2OfTarget = SearchInRangeUsingBinarySearch(arr, target, peak + 1, end);
            System.out.println("Index of the Target in 2nd half "+index2OfTarget);
        }
        else
        {
            System.out.println("Index of the Target in 1st half "+index1OfTarget);
        }

    }

    public static int findPeakElement_Index(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        int mid = start + (end - start)/2; //more optimized

        //checking from start to end and in the end only 1 element will be left therefore start = end 
        while(start <= end)
        {
            //here 4 cases will be there

            //case 1 :
            if(arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            //case 2 :
            if(arr[mid] < arr[mid - 1])
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
        return start; //since start and end will be the same in the end therefore we can return anything
    }

    public static int SearchInRangeUsingBinarySearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start + (end - start)/2;      // More Optimized 
            
            if(arr[mid] < target)
            {
                start = mid + 1;
                
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
