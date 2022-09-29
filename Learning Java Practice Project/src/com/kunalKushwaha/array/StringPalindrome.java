//Question : Check whether the string is palidrome of not

package com.kunalKushwaha.array;

public class StringPalindrome {
    public static void main(String[] args) {
        String st = "abcdcba";

        System.out.println(isPalindrome(st));
    }
    public static boolean isPalindrome(String str)
    {
        if(str == null || str.equals(""))
        {
            return true;
        }

        str = str.toLowerCase();

        for(int i = 0; i <= str.length()/2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
            {
                return false;
            }
        }
        return true;
    }
}
