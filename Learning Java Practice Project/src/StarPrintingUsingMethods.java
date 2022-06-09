import java.util.Scanner;

public class StarPrintingUsingMethods{
    public static void main(String[] args) {
        
        // Prrint(6);
        StarPrrint(5);
    
    }

    public static void Prrint(int n)
    {
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void StarPrrint(int n)
    {
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
