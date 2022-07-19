package com.kunalKushwaha.BinarySearchQuestions;
//You have to find an element in the mountain array
//find the peak of the array
//then search for the target in first half 
//and then search for the target in second half
public class FindElementInMountainArray {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2};
        int target = 3;

        int peak = findPeakUsingBinarySearch(arr);
        int end = arr.length - 1;
        
       int firstHalfIndex = SearchInRangeBinarySearch(arr, target, 0, peak);

       if(arr[firstHalfIndex] == target)
       {
            System.out.println("Found in the first half "+firstHalfIndex);
       }
       else
       {
            int SecondHalfInteger = SearchInRangeBinarySearch(arr, target, peak+1, end);
            System.out.println("Found in the second half "+SecondHalfInteger);
       }
        
    }
    
    public static int findPeakUsingBinarySearch(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start != end)
        {
            //find middle element
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1])
            {
                //because you are in the decreasing part of the array 
                //hence the answer will lie in the left of the array
                //and you dont need to check for mid + 1 because we already checked it 
                //It is less than the mid
                end = mid;
            }
            else
            {
                //arr[mid] < arr[mid + 1]
                //you are in the increasing part of the array
                //hence the answer will lie in the right of the array
                //here start will set to the mid + 1 because we checked the mid is lesser than the mid + 1 
                //hence start will be like this
                start = mid + 1;
            }
            
        }
        //in the end while loop breaks when start and end will be equal and 
        //point the peak element 
        return start; //or end since both will be equal at the end
    }

    public static int SearchInRangeBinarySearch(int[] arr, int target, int start, int end)
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
