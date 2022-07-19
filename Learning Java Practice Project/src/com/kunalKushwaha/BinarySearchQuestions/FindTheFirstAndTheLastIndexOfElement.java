package com.kunalKushwaha.BinarySearchQuestions;


//facebook interview

public class FindTheFirstAndTheLastIndexOfElement {
    public static void main(String[] args) {
        boolean isFindingFirstIndex = true;

        int[] arr = {1,3,4,6,6,6,7,8,9};
        int target = 6;

        int firstIndex = SearchUsingBinarySearch(arr, target, true);
        int secondIndex = SearchUsingBinarySearch(arr, target, false);

        System.out.println("First Index : "+firstIndex+" Second Index : "+secondIndex);
        
    }

    static int SearchUsingBinarySearch(int[] arr, int target, boolean isFindingFirstIndex)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
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
                ans = mid;
                if(isFindingFirstIndex)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
