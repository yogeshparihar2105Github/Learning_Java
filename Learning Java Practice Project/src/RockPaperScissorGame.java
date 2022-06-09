import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        
        //ask user for a number 1.for rock 2.for paper 3.for scissor
        //generate a random number from 1 to 3 
        //compare user number and genrated number 
        //if user enter  1 and computer generate 2 then computer wins
        //and so on

        System.out.println("Enter a number \n 1 for rock\n 2 for paper\n 3 for scissor ");

        Scanner sc = new Scanner(System.in);

        int userNumber = sc.nextInt();

        int computerGeneratedNumber = GenerateRandomNumber(1,3);

        System.out.println("Computer Number is "+ computerGeneratedNumber);
        

        for(int i = 1; i<=3; i++)
        {
            if(userNumber == i && computerGeneratedNumber == i)
            {
                System.out.println("It's a Draw");
            }
        }

        if(userNumber == 1 && computerGeneratedNumber == 2)
        {
            System.out.println("Sorry ! You Lose !!");
        }
        else if(userNumber == 1 && computerGeneratedNumber == 3)
        {
            System.out.println("Congo !You Win");
        }


        else if(userNumber == 2 && computerGeneratedNumber == 1)
        {
            System.out.println("Congo !You Win");
        }
        else if(userNumber == 2 && computerGeneratedNumber == 3)
        {
            System.out.println("Sorry ! You Lose !!");
        }


        else if(userNumber == 3 && computerGeneratedNumber == 1)
        {
            System.out.println("Sorry ! You Lose !!");
        }
        else if(userNumber == 3 && computerGeneratedNumber == 2)
        {
            System.out.println("Congo !You Win");
        }
        
    }

    public static int GenerateRandomNumber(int min, int max) 
    {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
