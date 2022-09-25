package com.kunalKushwaha.mathematicalQuestionsPractice;

import java.util.Scanner;

public class NegativeSum_EvenPositiveSum_OddPositiveSum {
    public static void main(String[] args) {

        System.out.println("Enter a number :");

        Scanner sc = new Scanner(System.in);

        int userNumber = 0 ;

        int sumOfOddPosiNum = 0;
        int sumOfNegNum = 0;
        int sumOfEvenPosiNum = 0;

        do
        {
            userNumber = sc.nextInt();

            if(userNumber<0)
            {
                sumOfNegNum += userNumber;
            }
            else if(userNumber>0 && userNumber%2==0)
            {
                sumOfEvenPosiNum += userNumber;
            }
            else if(userNumber>0 && userNumber%2!=0)
            {
                sumOfOddPosiNum += userNumber;
            }
        }while(userNumber!=0);

        System.out.println("Sum of Negative number is : "+sumOfNegNum);
        System.out.println("Sum of Even Positive number is : "+sumOfEvenPosiNum);
        System.out.println("Sum of Odd Positive number is : "+sumOfOddPosiNum);
    }
}
