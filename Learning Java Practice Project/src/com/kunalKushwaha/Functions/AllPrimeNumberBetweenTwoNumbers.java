package com.kunalKushwaha.Functions;

import javax.swing.text.StyledEditorKit.BoldAction;

public class AllPrimeNumberBetweenTwoNumbers {
    public static void main(String[] args) {
        primeBetween(2, 10);
    }
    static boolean isPrime(int n){
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    static void primeBetween(int n1, int n2)
    {
        for(int i=n1;i<=n2;i++)
        {
            if(isPrime(i))
            {
                System.out.println("Prime Numbers are : "+i);
            }
        }
    }
}
