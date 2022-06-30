import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args) {
        DecimalToBinary();
    }

    private static void DecimalToBinary() {
        System.out.print("Give me a decimal number and I will give you Binary equivalent : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int binary = 0;
        int quotient = 0;
        int remainder = number%2;


        while(quotient==0)
        {
            quotient = number/2;
            remainder += (quotient%2)*10;
        }
        
        System.out.println(remainder);
    }
}
