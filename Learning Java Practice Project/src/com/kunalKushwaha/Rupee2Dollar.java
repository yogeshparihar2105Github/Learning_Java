package com.kunalKushwaha;

import java.util.Scanner;

public class Rupee2Dollar {
    public static void main(String[] args) {
        System.out.print("Enter the Rupees to Convert in Dollar :");
        try (Scanner sc = new Scanner(System.in)) {

            float rupe = sc.nextFloat();
            float doll = Rup2Dol(rupe);

            System.out.println("Dollar is : "+doll);
        }
    }
    public static float Rup2Dol(float n)
    {
        return n*0.013f;
    }
}
