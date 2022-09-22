// Question : https://leetcode.com/problems/merge-sorted-array/ 
// Answer : https://www.youtube.com/watch?v=C4oBXLr3zos&ab_channel=AlgorithmsMadeEasy

package com.kunalKushwaha.SortingAlgoNQuestions;

public class MergeSortedArray {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    { 
        // Taking 3 pointer i is the index pointer where largest element should be stored
        
        // hence it is equal to m+n-1
        int i = m+n-1;

        // p1 is the index of maximum element in nums1 array
        int p1 = m-1;

        // p2 is the index of maximum element in nums2 array
        int p2 = n-1;
        
        // p1 and p2 are index number so it can never be less than 0
        // if it happens that means 
        // we have merge the sorted array
        // hence we can break the loop
        while(p2>=0)
        {
            // the largest from nums1[p1] and nums2[p2] should be stored in the nums1[i]
            if(p1>=0 && nums1[p1]>nums2[p2])
            {
                nums1[i] = nums1[p1];
                
                // since we have found one largest element 
                // hence we can decrease the pointer to sort the other elements
                p1--;
                i--;
            }
            else
            {
                nums1[i] = nums2[p2];
                p2--;
                i--;
            }
        } 
    }
}