package com.kunalKushwaha.Functions;

public class SumOfFirstNnaturalNumber {
    
    public static void main(String[] args) {
        System.out.println(sumOfNnaturalNumber(10));
    }
    static int sumOfNnaturalNumber(int n)
    {
        return (n*(n+1))/2;
    }
}
