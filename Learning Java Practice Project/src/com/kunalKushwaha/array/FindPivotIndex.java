package com.kunalKushwaha.array;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int n = pivotIndex(arr);
        System.out.println(n);
    }

    public static int pivotIndex(int[] nums) {

        int pivotIndex = 0;

        while(pivotIndex < nums.length)
        {
            int leftSum = 0;
            int rightSum = 0;

            for(int i = 0; i < pivotIndex; i++)
            {
                leftSum += nums[i];
            }
            for(int j = pivotIndex + 1; j < nums.length; j++)
            {
                rightSum += nums[j];
            }

            if(leftSum == rightSum)
            {
                return pivotIndex;
            }
            else
            {
                pivotIndex++;
            }
        }
        return -1;
    }
}
