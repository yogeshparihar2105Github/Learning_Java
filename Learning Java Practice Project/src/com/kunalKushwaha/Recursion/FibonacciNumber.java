package com.kunalKushwaha.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int n)
    {
        //base condition
        if(n < 2)
        {
            //because fib(1) = 1 && fib(0) = 0
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
