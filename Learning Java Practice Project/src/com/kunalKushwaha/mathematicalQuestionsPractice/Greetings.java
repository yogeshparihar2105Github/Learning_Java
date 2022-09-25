package com.kunalKushwaha.mathematicalQuestionsPractice;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        System.out.print("Enter the Name");

        try (Scanner sc = new Scanner(System.in)) 
        {
            String name = sc.next();
            System.out.println("Hello, "+name+" nice to meet you!");
        }
    }
}
