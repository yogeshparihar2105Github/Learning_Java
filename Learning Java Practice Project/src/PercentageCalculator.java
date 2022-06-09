import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        int maxNum = 500;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Sub 1 ");
        int sub1num = sc.nextInt();

        System.out.println("Enter number of Sub 2 ");
        int sub2num = sc.nextInt();

        System.out.println("Enter number of Sub 3 ");
        int sub3num = sc.nextInt();

        System.out.println("Enter number of Sub 4 ");
        int sub4num = sc.nextInt();

        System.out.println("Enter number of Sub 5 ");
        int sub5num = sc.nextInt();


        float perrcent = (sub1num + sub2num + sub3num + sub4num + sub5num)/5;

        System.out.println("The Percentage is : "+perrcent);


    }

}
