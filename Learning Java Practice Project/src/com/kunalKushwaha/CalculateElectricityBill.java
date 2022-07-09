package com.kunalKushwaha;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        System.out.println("The 1 unit electricity is 10 INR : Enter the number of Units to know your bill: ");
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();

    int m = n*10;

    System.out.print("Your Electricity bill is : "+ m+" INR");
    }
}
