import java.util.Scanner;

public class Sum3Num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
            System.out.println("Enter num 1");
            int num1 = sc.nextInt();

            System.out.println("Enter num 2");
            int num2 = sc.nextInt();


            System.out.println("Enter num 3");
            int num3 = sc.nextInt();
        
        int sum = num1+num2+num3;

        System.out.println("Sum is equal to : "+sum);
        
    }
}
