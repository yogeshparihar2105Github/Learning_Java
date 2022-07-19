package com.kunalKushwaha.BinarySearchQuestions;
//we can't use arr.length here 
//Amazon question
public class FindPosOfTargetInSorted_InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,11,33,45,56};     //Imagine Infinite array
        int target = 9;
        int targetIndex = ans(arr, target);
        System.out.println(targetIndex);

    }
    public static int ans(int[] arr, int target)
    {
        int start = 0;
        int end = 1;
        
        while(target > arr[end])
        {
            int newStart = end + 1;
            //double the chunk size
            //size of chunk = end + 1 - start
            end = end  + (end + 1 - start)*2;
            start = newStart;
        }
    
        //Apply binary search for the chunk
        return SearchInRangeUsingBinarySearch(arr, target, start, end);
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
