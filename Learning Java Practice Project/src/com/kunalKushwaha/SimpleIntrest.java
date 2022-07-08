package com.kunalKushwaha;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {

        System.out.print("Enter the Principle :");

        try(Scanner sc = new Scanner(System.in))
        {
            int principle = sc.nextInt();
        
            System.out.print("Enter the Rate :");
            int rate = sc.nextInt();

            System.out.print("Enter the Time :");
            int time = sc.nextInt();

            float si = simpleInterest(principle, rate, time);
            System.out.println("The Simple Interest is :"+si);
        }
    }

    public static float simpleInterest(int p, int r, int t)
    {
        return (p*r*t)/100;
    }
}
