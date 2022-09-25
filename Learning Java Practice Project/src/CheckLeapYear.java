import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        //leap year divide by 4;
        //Except 100; if it is 100 then it should be divided by 400 as well to be a leap year

        //print Enter the leap year 
        //Ask the user to enter an integer
        //Calculate that is a leap year of not
        //print leap year or not
        
        
        System.out.println("Enter the Year : ");

        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();       

            if(year % 100 == 0 && year % 400 == 0)
            {
                System.out.println(year + " Year is a leap Year");    
            }
            else if (year % 4 == 0 && year % 100 != 0)
            {
                System.out.println(year + " Year is a leap Year");
            }
            else
            {
                System.out.println(year +" Year is Not a leap Year");
            }
        }


        

    }
}
