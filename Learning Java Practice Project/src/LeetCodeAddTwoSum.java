import java.util.Scanner;

public class LeetCodeAddTwoSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int lengthArray = sc.nextInt();

        int[] array = new int[lengthArray];

        for(int i = 0; i< array.length; i++)
        {
            System.out.println("Enter Element " + i + " of array make sure there will no duplicate numbers : ");
            array[i] = sc.nextInt();
        }

        int target;

        System.out.println("Enter the target which is the sum of two number is array");
        target = sc.nextInt();

        KnowTheIndicesOfTheNumber(array, target);
        
        
        
    }

    public static void KnowTheIndicesOfTheNumber(int[] arr, int target)
    {
        
        boolean isTrue = false;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j=0;j<arr.length;j++)
            {

                if(isTrue == false)
                {
                    if(arr[i]+arr[j] == target)
                    {
                        System.out.println(i);
                        System.out.println(j);
                        isTrue = true;
                    }
                }

            }
        }
  
    }
}
