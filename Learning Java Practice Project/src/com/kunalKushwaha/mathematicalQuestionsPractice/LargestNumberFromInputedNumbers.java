package com.kunalKushwaha.mathematicalQuestionsPractice;

import java.util.Scanner;

public class LargestNumberFromInputedNumbers {
    public static void main(String[] args) {
        System.out.println("Enter numbers and then press 0 to print the largest number :");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 1;

        while(m>0){
            System.out.println("Enter a number : ");
            m = sc.nextInt();
            if(m>n){
                n = m;
            }
        }
        System.out.println("The Greatest Number is : "+n);
    }
}
