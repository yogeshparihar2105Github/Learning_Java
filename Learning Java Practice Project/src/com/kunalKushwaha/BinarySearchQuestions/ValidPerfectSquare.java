package com.kunalKushwaha.BinarySearchQuestions;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        boolean patanahi = isPerfectSquare(5);

        System.out.println(patanahi);
    }

    public static boolean isPerfectSquare(int num) {
        
        if(num == 1)
        {
            return true;
        }
        
        long start = 1;
        long end = num;
        
        while(start < end)
        {
            long mid = start + (end - start)/2;
            if(mid * mid < num)
            {
                start = mid + 1;
            }
            else if (mid * mid > num)
            {
                end = mid;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
