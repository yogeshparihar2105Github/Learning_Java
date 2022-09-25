// Question : https://leetcode.com/problems/arranging-coins/

package com.kunalKushwaha.BinarySearchQuestions;

public class ArrangingCoins {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Number of complete rows can be formed with the number "+num+
                " is : "+arrangeCoins(num));
    }
    public static int arrangeCoins(int n) {
        
        // k(k+1)/2 <= n
        // find max value of k in the range of 1 to n

        long start = 0;
        long end = n;
        
        while(start <= end)
        {
            long mid = start + (end - start)/2;
            
            if(((mid*(mid+1))/2) <= n)
            {
                start = mid + 1;
            }
            else
            {
                end = mid-1;
            }
        }
        return (int)start-1;
}
}
