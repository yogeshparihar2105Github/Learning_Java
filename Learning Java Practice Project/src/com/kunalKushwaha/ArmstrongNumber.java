package com.kunalKushwaha;

public class ArmstrongNumber {
    public static void main(String[] args) {
        armStrongNumber(100, 999);
    }

    public static void armStrongNumber(int n1, int n2)
    {
        int result = 0;

        for(int i=n1; i<n2; i++)
        {
            int originalNumber = i;
            while(originalNumber != 0)
            {
                int remainder = originalNumber%10;
                result = result + (remainder*remainder*remainder);
                originalNumber = originalNumber/10;
            }
            if(result == i)
            {
                System.out.println(result);
            }
            result = 0;
        }
        
    }
}
