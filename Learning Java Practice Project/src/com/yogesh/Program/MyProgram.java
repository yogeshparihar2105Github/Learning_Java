package com.yogesh.Program;

import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
       String name = TakeName();
        MakeAStory(name);
    }

    private static void MakeAStory(String n) {
        System.out.println("Once upon a time there was a young boy named, "+n);
        System.out.println("He was very intelligent but after his high school...");
        System.out.println("...");
        System.out.println("Pay Price to continue the story of "+n);
    }

    private static String TakeName() {
        System.out.println("What is  your name: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        return s;
    }
}
