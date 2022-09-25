package com.kunalKushwaha.mathematicalQuestionsPractice;

import java.util.Scanner;

public class FibonacciSeriesUptoN {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms in the fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibOf(n);
    }

    public static void fibOf(int n)
    {
        int[] a = new int[n];

        a[0] = 0;
        a[1] = 1; 

        System.out.print(a[0]+" ");
        System.out.print(a[1]+" ");

        for(int i=2;i<n;i++)
        {
            a[i] = a[i-1] + a[i-2];
            System.out.print(a[i]+" ");
        }
    }
}
