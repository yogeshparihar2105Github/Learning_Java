import java.util.Scanner;

public class ProgramToSumFirstNEvenNumber {
    public static void main(String[] args) {
        
        System.out.println("Enter the number upto which you want sum");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < number; i++)
        {
            sum = sum + 2*i;
        }
        System.out.println("Sum of First " +number+ " Even number is:"+sum);

    }
}
