package com.kunalKushwaha.Functions;

public class EligibleToVote {
    public static void main(String[] args) {
        System.out.println(isEligibleToVote(19)); 
    }
    static boolean isEligibleToVote(int n)
    {
        if(n>=18)
        {
            return true;
        }
        return false;
    }
}
