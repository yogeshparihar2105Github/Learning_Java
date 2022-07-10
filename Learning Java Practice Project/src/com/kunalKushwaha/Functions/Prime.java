package com.kunalKushwaha.Functions;

public class Prime {
    
    public static void main(String[] args) {
        isPrime(5);
    }
    static void isPrime(int n){
        for(int i = 2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("NOt Prime");
                break;
            }
            else
            {
                System.out.println("Prime");
                break;
            }
        }
    }
}
