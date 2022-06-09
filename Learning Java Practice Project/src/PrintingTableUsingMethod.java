import java.util.Scanner;

public class PrintingTableUsingMethod {
    public static void main(String[] args) {
        System.out.print("Enter number to print table :");


        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        PrintTableOf(number);

    }

    public static void PrintTableOf(int n)
    {
        for(int i =1;i<11;i++)
        {
            System.out.println(n*i);
        }
    }

}
