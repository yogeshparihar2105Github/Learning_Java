package com.kunalKushwaha;

import java.util.Scanner;

public class EvenORodd {
    public static void main(String[] args) 
    {
        System.out.print("Enter the Number...");

        try (Scanner sc = new Scanner(System.in)) 
        {
            int num = sc.nextInt();
            checkEvenORodd(num);
        }
    }

    public static void checkEvenORodd(int n)
    {
        if(n%2==0){
            System.out.println("The number "+n+" is Even");
        }
        else{
            System.out.println("The number "+n+" is Odd");
        }
    }
}
