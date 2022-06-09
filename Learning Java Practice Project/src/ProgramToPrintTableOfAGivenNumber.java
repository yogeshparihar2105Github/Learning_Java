import java.util.Scanner;

public class ProgramToPrintTableOfAGivenNumber {
    public static void main(String[] args) {

        System.out.print("Give the Number to print the Table : ");
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        for(int i = 1; i<= 10; i++)
        {
            System.out.println(num*i);
        }
    }
}
