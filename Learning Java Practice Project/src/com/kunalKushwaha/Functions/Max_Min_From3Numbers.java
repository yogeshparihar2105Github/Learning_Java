package com.kunalKushwaha.Functions;

public class Max_Min_From3Numbers {
    public static void main(String[] args) {
        max(1,2,3);
        min(1,2,3);
    }
    static void max(int n1,int n2,int n3){
        if(n1<n2)
        {
            n1 = n2;
            if(n1>n3)
            {
                System.out.println(n1+" is the Greatest number");
            }
            else
            {
                System.out.println(n3+" is the Greatest number");
            }
        }
        else{
            n2 = n1;
            if(n2>n3)
            {
                System.out.println(n2+" is the Greatest number");
            }
            else
            {
                System.out.println(n3+" is the Greatest number");
            }
        }

    }  
    static void min(int n1,int n2,int n3){
        if(n1>n2)
        {
            n1 = n2;
            if(n1<n3)
            {
                System.out.println(n1+" is the Smallest number");
            }
            else
            {
                System.out.println(n3+" is the Smallest number");
            }
        }
        else{
            n2 = n1;
            if(n2<n3)
            {
                System.out.println(n2+" is the Smallest number");
            }
            else
            {
                System.out.println(n3+" is the Smallest number");
            }
        }

    }   
}
