package com.kunalKushwaha.mathematicalQuestionsPractice;

public class Power {
    public static void main(String[] args) {
       int r =  power(6, 3);
       System.out.println(r);
    }
    
    public static int power(int n , int p)
    {
        int result =1;
        for(int i=1;i<=p;i++){
             result = result * n;
        }
        return result;
    }
}
