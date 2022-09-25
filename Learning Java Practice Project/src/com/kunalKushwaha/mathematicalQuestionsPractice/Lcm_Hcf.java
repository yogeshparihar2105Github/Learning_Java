package com.kunalKushwaha.mathematicalQuestionsPractice;

public class Lcm_Hcf {
    public static void main(String[] args) {
        
        lcm(10, 12); 
        hcf(16, 20);

    }
    public static void lcm(int n1, int n2){

        for(int i = 1; i<=n1*n2;i++)
        {
            int c = n1*i;
            if(c%n1 == 0 && c%n2 == 0)
            {
                System.out.println("LCM is : "+c);
                break;
            }
        }
    }

    public static void hcf(int n1, int n2){

        for(int i = n1; i>0;i--)
        {
            if(n1%i == 0 && n2%i == 0)
            {
                System.out.println("HCF is : "+i);
                break;
            }
        }
    }


}
