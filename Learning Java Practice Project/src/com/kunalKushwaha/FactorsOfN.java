package com.kunalKushwaha;

import java.util.Scanner;

public class FactorsOfN {
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        factorsOf(n);
    }

    public static void factorsOf(int n){
        int factors = 1;
        int remainder;
        System.out.print("Factors are : "+factors);
        for(int i=2;i<=n;i++)
        {
            remainder = n%i;
            if(remainder == 0){
                factors = i;
                System.out.print(" "+factors);
            }
        }

    }
}
