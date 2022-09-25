package com.kunalKushwaha.mathematicalQuestionsPractice;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        System.out.print("Enter the first number :");

        try(Scanner sc = new Scanner(System.in))
        {
            int num1 = sc.nextInt();

            System.out.print("Enter the operator (i.e + - * /) :");
            char operator = sc.next().charAt(0);

            System.out.print("Enter the second number :");
            int num2 = sc.nextInt();

            float result = calculate(num1, operator, num2);
            System.out.println("The result is :"+result);  
        }
    }

    public static float calculate(int n1,char operator, int n2)
    {
        if(operator == '+')
        {
            return n1+n2;
        }
        else if(operator == '-')
        {
            return n1-n2;
        }
        else if(operator == '*')
        {
            return n1*n2;
        }
        else if(operator == '/')
        {
            return n1/n2;
        }
        else
        {
            return 0;
        }
    }
}
