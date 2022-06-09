import java.util.Scanner;

public class SumOfThedigitInATable {
    public static void main(String[] args) {

        System.out.print("Enter a Number To Print the Table and sum of the Digits in the Table : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=10;i++)
        {
            System.out.println(num*i);
            sum = sum + num*i;
        }

        System.out.println("Sum : "+sum);

    }
}
