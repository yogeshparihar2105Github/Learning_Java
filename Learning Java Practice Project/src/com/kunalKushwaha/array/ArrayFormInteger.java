package com.kunalKushwaha.array;

public class ArrayFormInteger {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        // System.out.println(ArrayToInt(arr));
        int n = 12345;
        int [] resu = IntToArray(n); 
        
        for(int i = 0; i< resu.length;i++)
        {
            System.out.println("Element number "+i+" is : "+resu[i]);
        }
    }
    public static int ArrayToInt(int[] arr)
    { 
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            int num = 1;
            int numOfZero = 0;
            numOfZero = (arr.length - 1) - i;
            
            for(int j = 0; j<numOfZero;j++)
            {
                num *= 10;
            }
            sum += arr[i]*num;
        }
        return sum;
    }

    public static int[] IntToArray(int n)
    {
        int originalNum = n;
        //we have to calculate the number of digit n to find the length of the array
        int count = 0;
        while(n!=0)
        {
            n = n/10;
            count++;
        }

        int lenghtOfArray = count;

        int[] ans = new int[lenghtOfArray];

        int i = lenghtOfArray -1;
        while(originalNum!=0)
        {
            int rem = originalNum%10;
            originalNum = originalNum/10;
            ans[i] = rem;
            i--;
        }
        
        return ans;
    }


}
