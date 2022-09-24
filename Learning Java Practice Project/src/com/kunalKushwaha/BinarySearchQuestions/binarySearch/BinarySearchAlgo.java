// BinarySearchAlgo -> find middle then go left or right based on less or greater than the target

package com.kunalKushwaha.BinarySearchQuestions.binarySearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,12,34};
        int target = 12;

        int index = SearchUsingBinarySearch(arr, target);
        System.out.println(index);
    }

    static int SearchUsingBinarySearch(int[] arr, int target)
    {
        // Always at 0-index if you want to search in full array
        int start = 0;

        // Always at last-index if you want to search in full array
        int end = arr.length-1;

        // if start is greater than the end that means we have
        // search every element in array
        // so we can break the loop
        while(start<=end)
        {
            //find the middle index
            //if the target > middle element find in the right of the middle index ==> start = mid + 1
            //else find in the left of the mid ==> end = mid - 1
            //repeat

            // int mid = (start+end)/2;  //This can take time
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
                // if mid is equal to target
                // that means we have found the element
                // hence we can return it
                return mid;
            }
        }
        // if we didn't find the element in the array
        // we will return -1 to show we have not found the element
        return -1;
    }
}
