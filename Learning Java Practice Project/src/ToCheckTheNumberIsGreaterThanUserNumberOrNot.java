import java.util.Scanner;

public class ToCheckTheNumberIsGreaterThanUserNumberOrNot {
    public static void main(String[] args) {
        
        int givenNumber = 50;

        System.out.println("Enter any number : ");

        Scanner sc = new Scanner(System.in);

        int userNumber = sc.nextInt();

        System.out.println(userNumber>givenNumber);

    }
}
