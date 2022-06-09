import java.util.Scanner;
import java.util.Random;

class GuessNumber{

    int computerNumber;
    int userNumber;
    boolean isCorrrect;

    GuessNumber()
    {
        Random rand = new Random();
        computerNumber = rand.nextInt(100);
    }

    void TakeInput()
    {
        System.out.print("Enter any number between 0 to 100 : ");
        Scanner sc = new Scanner(System.in);
        userNumber = sc.nextInt();
    }

    boolean CheckNumbers()
    {
        if(computerNumber == userNumber)
        {
            isCorrrect = true;
            System.out.println("The Computer Number was : "+ computerNumber);
            System.out.println("You are Correct");
            return isCorrrect;
        }
        else if(computerNumber>userNumber)
        {
            System.out.println("computer has a bigger number");
        }
        else if(computerNumber < userNumber)
        {
            System.out.println("You are bigger");
        }
        return isCorrrect = false;
    }

}


public class GuessTheNumberGame {
    public static void main(String[] args) {
        
        GuessNumber gs = new GuessNumber();

        while(gs.isCorrrect!=true)
        {
            gs.TakeInput();
            gs.CheckNumbers();
        }

    }
    
}
