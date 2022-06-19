import java.util.Scanner;

public class FindTheIndicesOfArrayWhichSumIsTarget {
public static void main(String[] args) {

    FindIndexOfArrayWhichSumIsTarget();
    
    
}

public static void FindIndexOfArrayWhichSumIsTarget()
{
    int [] arr;

    System.out.print("Enter the size of array : ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    arr = new int [size];

    for(int k=0; k<arr.length; k++)
    {
        System.out.print("Enter the element " + k +" of array : ");
        arr[k] = sc.nextInt();
    }

    System.out.print("Enter target that is sum of two elements in array I will give you the Index of them : ");
    int target = sc.nextInt();

    for(int i=0; i<arr.length; i++)
    {
        for(int j=i+1; j<arr.length; j++)
        {
            if(arr[i]+arr[j] == target)
            {
                System.out.println("The Indices of the numbers in array which sums up to target is : "+i+" And "+j);
            }
        }
    }
}

}
