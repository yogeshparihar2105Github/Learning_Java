import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Array {
    public static void main(String[] args) {

       //SumOfArrayElement();

       //ChecksIfTheEnteredNumberIsPresentInArrayOrNot();

       //CalculateTheAverageOfAnArray();

       //ReversingArrayElements();
        
       //GreatestNumberInAnArray();

       //ToCheckArrayIsSortedOrNot();

    }

    private static void ToCheckArrayIsSortedOrNot() {
        boolean isSorted = true;
           int[] arr = {1,3,6,7,9,30};
           for(int i=0;i<arr.length -1; i++)
           {
               if(arr[i]>arr[i+1])
               {
                    isSorted = false;
                    break;
               }
           }

           if(isSorted)
           {
               System.out.println("Array is Sorted");
           }
           else
           {
               System.out.println("Array is not Sorted");
           }
    }

    private static void GreatestNumberInAnArray() {
        int [] arr = {1,2,45,63,7,3,7};
           int max = 0;

           for(int i=0; i<arr.length;i++)
           {
               if(arr[i]>max)
               {
                    max = arr[i];
               }
           }
           System.out.println(max);
    }

    private static void ReversingArrayElements() {
        int[] arr = {2,3,6,8,9,10,4};

           int l = arr.length;

           int n = Math.floorDiv(l, 2);

           int temp = 0;

           for(int i=0;i<n;i++)
           {
                temp = arr[i];
                arr[i] = arr[l-i-1];        // Reversing condition
                arr[l-i-1] = temp;
           }

           for(int i=0; i<arr.length; i++)
           {
               System.out.print(arr[i]+" ");
           }
    }

    private static void CalculateTheAverageOfAnArray() {
        int [] marks = {100,20,40,50,56,43,53,45,23};

           float average =0f;
           int sum = 0;
           for(int i =0; i<marks.length;i++)
           {
                sum += marks[i];

           }
                 
           average = sum/marks.length;

           System.out.println("Average is : "+average);
    }

    private static void ChecksIfTheEnteredNumberIsPresentInArrayOrNot() {
        int [] numbersArr = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        
        boolean isInArray = false;

        for(int i = 0; i<numbersArr.length;i++)
        {
            if(number == numbersArr[i])
            {
                isInArray = true;
                break;
            }
            
        }

        if(isInArray)
        {
            System.out.println("Yes the entered number is presented in array");
        }
        else{
            System.out.println("No the entered number is NOT presented in array");
        }

    }

    private static void SumOfArrayElement() {
        int [] flats = new int [5];

        flats[0] = 101;
        flats[1] = 102;
        flats[2] = 103;
        flats[3] = 104;
        flats[4] = 105;

        int sum = 0;

        for(int i = 0; i< flats.length; i++)
        {
            sum += flats[i];
        }

        System.out.println(sum);
    }
}
