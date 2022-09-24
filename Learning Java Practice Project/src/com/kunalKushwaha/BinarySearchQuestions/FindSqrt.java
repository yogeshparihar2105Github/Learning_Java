Question : https://leetcode.com/problems/sqrtx/submissions/

package com.kunalKushwaha.BinarySearchQuestions;

class FindSqrt {

    public int mySqrt(int x) {

        // getting the edge cases to reduce the complexity
        if(x == 0)
            return 0;
        if(x<4)
            return 1;

        // start will be 1 since we have already check for the 0
        int start = 1;

        // end will be the x because it is the last number
        int end = x;

        // we don't need to check for the start == end
        // because we can return any of them because they are equal
        // just decrease 1 from the ans
        while(start < end)
        {
            // calculating mid
            int mid = start + (end - start) / 2;

            // x == mid * mid, we have write it like this
            // because int * int can some time exceed the limit of int
            if(x / mid == mid)
            {
                return mid;
            }
            else if (x / mid > mid)
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return start - 1;
    }
}