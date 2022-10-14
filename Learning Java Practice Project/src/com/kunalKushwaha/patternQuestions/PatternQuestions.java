package com.kunalKushwaha.patternQuestions;

public class PatternQuestions {

    public static void main(String[] args) {
        pattern11(5);
    }

    public static void pattern1(int n)
    {
        //    *****
        //    *****
        //    *****
        //    *****
        //    *****
        for(int row = 1; row <= n; row++)
        {
            //In every Row print this much column
            for(int col = 1; col <= n; col++)
            {
                System.out.print("*");
            }
            //After every Row print new line
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        for(int row = 1; row <= n; row++)
        {
            //In every Row print this much column
            for(int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            //After every Row print new line
            System.out.println();
        }
    }
    public static void pattern3(int n)
    {
        //    *****
        //    ****
        //    ***
        //    **
        //    *
        for(int row = 1; row <= n; row++)
        {
            //In every Row print this much column
            for(int col = 1; col <= n-row+1; col++)
            {
                System.out.print("*");
            }
            //After every Row print new line
            System.out.println();
        }
    }
    public static void pattern4(int n)
    {
        //    1
        //    1 2
        //    1 2 3
        //    1 2 3 4
        //    1 2 3 4 5
        for(int row = 1; row <= n; row++)
        {
            //In every Row print this much column
            for(int col = 1; col <= row; col++)
            {
                System.out.print(col);
            }
            //After every Row print new line
            System.out.println();
        }
    }
    public static void pattern5(int n)
    {
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        //    ****
        //    ***
        //    **
        //    *
        int x = 2;
        for(int row = 1; row < 2*n; row++)
        {
            //In every Row print this much column

            //Do this when row <= n
            if(row <= n)
            {
                for(int col = 1; col <= row; col++)
                {
                    System.out.print("*");
                }
                //After every Row print new line
                System.out.println();
            }
            else
            {
                //if row > n
                for(int col = 1; col <= row-x; col++)
                {
                    System.out.print("*");
                }
                //After every Row print new line
                System.out.println();
                x += 2;
            }

        }
    }
    public static void pattern6(int n)
    {
        //you have to print spaces also
        //    *
        //   **
        //  ***
        // ****
        //*****
        for(int row = 1; row <= n; row++)
        {
            //first print spaces
            for(int spaces = 1; spaces <= n-row; spaces++)
            {
                System.out.print(" ");
            }
            //Now print stars in the same row
            for(int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            //After every Row print new line
            System.out.println();
        }
    }
    public static void pattern7(int n)
    {
        //you have to print spaces also
        //*****
        //****
        //***
        //**
        //*
        for(int row = 1; row <= n; row++)
        {
            //first print stars
            for(int col = 1; col <= n-row+1; col++)
            {
                System.out.print("*");
            }
            //Now print spaces
            for(int spaces = 1; spaces < row; spaces++)
            {
                System.out.print(" ");
            }

            //After every Row print new line
            System.out.println();
        }
    }
    public static void pattern8(int n)
    {
        //you have to print spaces also
        //    *
        //   ***
        //  *****
        // *******
        //*********
        for(int row = 1; row <= n; row++)
        {
            //first print spaces
            for(int spaces = 1; spaces <= n-row; spaces++)
            {
                System.out.print(" ");
            }
            //Now print stars in the same row
            for(int col = 1; col <= 2*row-1; col++)
            {
                System.out.print("*");
            }
            //Now print spaces again
            for(int spaces = 1; spaces <= n-row; spaces++)
            {
                System.out.print(" ");
            }
            //After every Row print new line
            System.out.println();
        }
    }
    public static void pattern9(int n)
    {
        //you have to print spaces also
        //*********
        // *******
        //  *****
        //   ***
        //    *
        int x = 0;
        for(int row = 1; row <= n; row++)
        {
            //first print spaces
            for(int spaces = 1; spaces < row; spaces++)
            {
                System.out.print(" ");
            }
            //Now print stars in the same row
            for(int col = 1; col <= 2*n-row-x; col++)
            {
                System.out.print("*");
            }
            //Now print spaces again
            for(int spaces = 1; spaces < row; spaces++)
            {
                System.out.print(" ");
            }
            //After every Row print new line
            System.out.println();
            x += 1;
        }
    }
    public static void pattern10(int n)
    {
        //you have to print spaces also
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        for(int row = 1; row <= n; row++)
        {
            //first print spaces
            for(int spaces = 1; spaces <= n-row; spaces++)
            {
                System.out.print(" ");
            }
            //Now print stars in the same row
            for(int col = 1; col <= row; col++)
            {
                System.out.print("*");
                if(row>1)
                {
                    System.out.print(" ");
                }
            }
            //Now print spaces again
            for(int spaces = 1; spaces <= n-row; spaces++)
            {
                System.out.print(" ");
            }
            //After every Row print new line
            System.out.println();
        }
    }
    public static void pattern11(int n)
    {
        //you have to print spaces also
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        int x = 0;
        for(int row = 1; row <= n; row++)
        {
            //print spaces if row > 1
            for(int spaces = 1; spaces < row; spaces++)
            {
                System.out.print(" ");
            }
            //Now print stars in the same row
            for(int col = 1; col <= n-row+1; col++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            //After every Row print new line
            System.out.println();
        }
    }
}
