package com.kunalKushwaha.mathematicalQuestionsPractice;

public class PalindromeNumber {
    public static void main(String[] args) {
        checkPalindromeNumber(1222);
    }
    public static void checkPalindromeNumber(int n){

        int remainder = 0;
        int revNum = 0;
        int originalNum = n;
        
        while(n>0)
        {
            remainder = n%10;
            revNum = (revNum * 10) + remainder;
            n = n/10;
        }
        if(revNum == originalNum)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
