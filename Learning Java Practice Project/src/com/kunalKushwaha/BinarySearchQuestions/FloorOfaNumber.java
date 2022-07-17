package com.kunalKushwaha.BinarySearchQuestions;

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,12,34};
        int target = 8;

        int index = Floor(arr, target);
        System.out.println(index);
    }

    static int Floor(int[] arr, int target)
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
        return end;
    }
}
