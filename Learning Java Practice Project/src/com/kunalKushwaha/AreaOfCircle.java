package com.kunalKushwaha;

import java.util.Scanner;


public class AreaOfCircle{
    public static void main(String[] args) {
        System.out.println("Enter the radius of The Circle :");
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        float area = areaOfCircle(rad);
        System.out.println("Area of Circle is :"+area);
    }
    public static float areaOfCircle(int radius){
        return 3.14f*radius*radius;
    }
}