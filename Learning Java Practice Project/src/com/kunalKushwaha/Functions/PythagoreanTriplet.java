//A Pythagorean triplet is when 
//the sum of the square of two numbers is equal to the square of the third number.
//a2 + b2 = c2;
// a2 + b2 + c2 - c2 = a2 + b2;

package com.kunalKushwaha.Functions;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        System.out.println(isPythgoreanTriplet(3, 4, 5));
    }
    static int square(int n)
    {
        return n*n;
    }
    static int max(int a, int b, int c){
        int max = 0;
        if(a>b)
        {
            if(a>c)
            {
                max = a;
                return max;
            }
            else
            {
                max = c;
                return max;
            }
        }
        else
        {
            if(b>c)
            {
                max = b;
                return max;
            }
            else
            {
                max = c;
                return max;
            }
        }

    }
    static boolean isPythgoreanTriplet(int a, int b, int c){
        int maxOf3 = max(a,b,c);

        int sumOfRemainingTwo = square(a)+square(b)+square(c)-square(maxOf3);

        if(sumOfRemainingTwo==square(maxOf3))
        {
            return true;
        }
        return false;
    }

}
