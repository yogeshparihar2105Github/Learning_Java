package com.kunalKushwaha.Recursion;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(foo(-4));
    }
    public static boolean foo(int m)
    {
        //Base Condition
        if(m == 1)
        {
            return true;
        }
        else if(m > 1 && (m % 2) != 0 /*you can merge the below condition here using OR*/)
        {
            return false;
        }
        else if(m <= 0)
        {
            return false;
        }

        //Body of the function
        //now whatever remaining from the above condition is only even number
        //so divide it by 2;

        m = m / 2;

        //Call the function with the new value of n
        return foo(m);
    }
}
