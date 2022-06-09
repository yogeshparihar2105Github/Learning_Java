import java.util.Scanner;

public class UnitConverter {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the Kilometer to Conver in Miles");

        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();

        //convert km  to miles

        float miles = km * 0.62f;

        System.out.println("The miles are : "+miles);
    }
}
