import java.util.Scanner;

public class MeetNGreet {
    public static void main(String[] args) {
        
        System.out.println("Enter Your Name");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Hello "+name+" Have a Nice Day");
    }
}
