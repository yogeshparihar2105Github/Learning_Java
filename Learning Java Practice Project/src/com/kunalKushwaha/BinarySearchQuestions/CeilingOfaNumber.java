package com.kunalKushwaha.BinarySearchQuestions;
//same as binary search just return start in place of -1

//ceiling of a number is lowest number greater than or equal to target 
public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,12,34};
        int target = 3;

        int index = Ceiling(arr, target);
        System.out.println(index);
    }

    static int Ceiling(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

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
                return mid;
            }
        }
        return start;
    }
}
