import java.util.Scanner;

public class CheckPalindromeNumber {
    
public static void main(String[] args) {
    
    CheckPalindromeNumberr();
    


}

public static boolean CheckPalindromeNumberr()
{
    System.out.print("Enter any number to check if it is palindrome or NOT : ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int reversedNum = 0;

    if(number < 0)
    {
        System.out.println("No it is not palindrome");
        return false;
    }
    else
    {
        while(number > reversedNum)
        {
            reversedNum = reversedNum*10 + number%10;
            number = number/10;
        }
    
        if(number == reversedNum || number == reversedNum/10)
        {
            System.out.println("Yes it is palindrome");
            return true;
        }
        else
        {
            System.out.println("No it is not palindrome");
            return false;
        }
    }
}
}
