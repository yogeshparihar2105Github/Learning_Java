package com.kunalKushwaha.mathematicalQuestionsPractice;


public class nPr_nCr {
    
    public static void main(String[] args) {
        float npr = nPr(10, 4);
        float ncr = nCr(10, 4);

        System.out.println("NpR is "+npr);
        System.out.println("NcR is "+ncr);
    }
    
    public static float nPr(int n, int r)
    {
        int nFac = new Factorial().FactorialUsingRecursion(n);
        int nMINUSrFac = new Factorial().FactorialUsingRecursion(n-r);

        return nFac/nMINUSrFac;

    }
    public static float nCr(int n, int r)
    {
        int nFac = new Factorial().FactorialUsingRecursion(n);
        int rFac = new Factorial().FactorialUsingRecursion(r);
        int nMINUSrFac = new Factorial().FactorialUsingRecursion(n-r);

        return nFac/(rFac*nMINUSrFac);

    }
}
