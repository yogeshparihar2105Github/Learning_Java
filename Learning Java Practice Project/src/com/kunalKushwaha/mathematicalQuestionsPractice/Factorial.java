package com.kunalKushwaha.mathematicalQuestionsPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Enter a number To calculate it's factorial :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // FactorialUsingWhile(n);
        // int m = FactorialUsingRecursion(n);
        // System.out.println(m);

    }

    private static void FactorialUsingWhile(int n) {
        int i = n;
        while(i>1){
            n = n * (i-1);
            i--;
        }
        System.out.println("Factorial is : "+n);
    }

    public int FactorialUsingRecursion(int n)
    {
        if(n>1)
        {
            return n*FactorialUsingRecursion(n-1);
        }
        else
        {
            return 1;
        }
        
    }
}
