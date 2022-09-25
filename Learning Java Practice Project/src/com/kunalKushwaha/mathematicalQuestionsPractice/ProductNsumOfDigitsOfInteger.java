package com.kunalKushwaha.mathematicalQuestionsPractice;

import java.util.Scanner;

public class ProductNsumOfDigitsOfInteger {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float product = productOfDigitsOf(n);
        float sum = sumOfDigitsOf(n);

        float subtration = product - sum;

        System.out.println("The Subtraction of Product and Sum of the Digits of Number "+n+" is : "+subtration);
        
    }

    public static float productOfDigitsOf(int n){
        int remainder = 0;
        int product = 1; 
        while(n>0){
            remainder = n%10;
            product *= remainder;
            n = n/10;
        }
        return product;
    }
    public static float sumOfDigitsOf(int n){
        int remainder = 0;
        int sum = 0; 
        while(n>0){
            remainder = n%10;
            sum += remainder;
            n = n/10;
        }
        return sum;
    }
}
