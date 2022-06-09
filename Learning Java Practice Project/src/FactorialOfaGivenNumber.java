import java.util.Scanner;

public class FactorialOfaGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to print the factorial");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int fac = num;

        for(int i = 1 ; i < num; i++)
        {
            
            fac = fac*i;
           
        }
        System.out.println(num +" Factorial is "+ fac);

    }
}
