package com.kunalKushwaha;

import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {
        System.out.println("Enter First Number : ");
        
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();

            System.out.println("Enter First Number : ");
            int n2 = sc.nextInt();
            
            int max = maxNum(n1, n2);
            System.out.println("The maximum number is : "+max);
        }
    }

    public static int maxNum(int n1, int n2)
    {
        int max = 0;
        if(n1>n2)
        {
            max = n1;
        }
        else 
        {
            max = n2;
        }
        return max;
    }
}


