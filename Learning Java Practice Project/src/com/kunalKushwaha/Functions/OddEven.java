package com.kunalKushwaha.Functions;

public class OddEven {
    
    public static void main(String[] args) {
        boolean b = isEven(3);
        System.out.println(b);
    }
    static boolean isEven(int n){
        if(n%2==0)
        {
            return true;
        }
        return false;
    }
}
