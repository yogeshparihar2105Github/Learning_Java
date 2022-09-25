//A number is perfect number when sum of all the factors except itself of that 
//number is equal to the number itself

package com.kunalKushwaha.mathematicalQuestionsPractice;

public class PerfectNumber {
    public static void main(String[] args) {
        perfectNum(496);

    }
    public static void perfectNum(int n)
    {
        if(SumOfFactorsOf(n)==n)
        {
            System.out.println("Perfect Number ");
        }
        else
        {
            System.out.println("Not Perfect number");
        }
    }
    public static int SumOfFactorsOf(int n)
    {
        int sumOfFactors = 0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sumOfFactors += i;
            }
        }
        return sumOfFactors;
    }
}
