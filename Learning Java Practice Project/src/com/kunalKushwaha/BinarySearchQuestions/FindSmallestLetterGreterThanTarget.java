package com.kunalKushwaha.BinarySearchQuestions;

//This is exactly the same ceiling question

public class FindSmallestLetterGreterThanTarget {
    public static void main(String[] args) {
       char[] letters = {'c','f','j'};
       char target = 'd';

       char ans = nextGreatestLetter(letters, target);
       System.out.println(ans);

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start<=end)
        {
            //find the middle index
            //if the target > middle element find in the right of the middle index ==> start = mid + 1
            //else find in the left of the mid ==> end = mid - 1
            //repeat

            // int mid = (start+end)/2;  //This can take time
            int mid = start + (end - start)/2;      // More Optimized 

            if(letters[mid] > target)
            {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
            
        }
        return letters[start%letters.length];
    }
}
