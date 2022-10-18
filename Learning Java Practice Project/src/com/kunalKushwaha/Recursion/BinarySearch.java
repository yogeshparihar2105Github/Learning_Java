package com.kunalKushwaha.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,7};

        System.out.println(BinarySearchUsingRecursion(-1,nums,0,5));
    }
    public static int BinarySearchUsingRecursion(int target, int[] nums, int start, int end)
    {
        //base condition
        if(start > end)
        {
            return -1;
        }
        //body of the function
        int mid = start + (end - start)/2;

        if(nums[mid] == target)
        {
            return mid;
        }
        else if(nums[mid] < target)
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }

        //calling function itself recursively

        return BinarySearchUsingRecursion(target,nums,start,end);
    }
}
