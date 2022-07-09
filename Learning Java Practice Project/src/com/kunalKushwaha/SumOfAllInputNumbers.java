package com.kunalKushwaha;

import java.util.Scanner;

public class SumOfAllInputNumbers {
    public static void main(String[] args) {

        System.out.println("Enter a Numbers Then press 0 to print the sum of all the numbers :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while(n>0)
        {
            sum += n;
            System.out.println("Enter a Number :");
            n = sc.nextInt();
        }

        System.out.println("Sum of all the numbers is : "+sum);
        
    }
}
