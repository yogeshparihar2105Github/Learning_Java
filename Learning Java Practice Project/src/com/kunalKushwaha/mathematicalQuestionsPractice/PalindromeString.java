package com.kunalKushwaha.mathematicalQuestionsPractice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.print("Enter any string : ");
        Scanner sc =new Scanner(System.in);

        String str = sc.next();
        String rev = "";

        for(int i = (str.length())-1;i>=0;i--)
        {
            rev += str.charAt(i);
        }
        if(rev.equals(str))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
