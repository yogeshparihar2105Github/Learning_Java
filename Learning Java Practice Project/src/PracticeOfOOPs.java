public class PracticeOfOOPs {
    public static void main(String[] args) {

        System.out.println("This is an Practice Of OOPs in Java\n\n");

/* 
    //Problem 1
        Employee employee1 = new Employee();

        employee1.salary = 12000;
        employee1.setName("Ramesh");

        String naem = employee1.getName();
        int sal = employee1.getSalary();
        
        System.out.println("This is employee 1 "+naem);
        System.out.println("And The salary is "+sal);
*/

/*
 
    //Problem 2
        Phone newPhone = new Phone();

        newPhone.isRinging();
        newPhone.isVibrating();
*/

 /*
    //Problem 3
        Square newSquare = new Square();

        newSquare.side = 6;

        int area = newSquare.CalculateArea();
        int perimeter = newSquare.CalculatePerimeter();
        
        System.out.println("Area : "+area);
        System.out.println("Perimeter : "+perimeter);
*/


    //Problem 4
        TommyVercetti tomy = new TommyVercetti();

        tomy.name = "Tummy";

        tomy.isEating();
        tomy.isRunning();
        tomy.isFiring();



    }
}

class Employee11
{
    String name;
    int salary;

    int getSalary()
    {
       return salary;
    }

    String getName()
    {
        return name;
    }

    void setName(String naam)
    {
         name = naam;
    }
}

class Phone1
{

    void isRinging()
    {
        System.out.println("The Phone is Ringing");   
    }
    void isVibrating()
    {
        System.out.println("The Phone is Vibrating");   
    }

}

class Square1
{
    int side;

    int CalculateArea()
    {
        return side*side;
    }

    int CalculatePerimeter()
    {
        return 4*side;
    }
}

class TommyVercetti
{
    String name;

    void isRunning()
    {
        System.out.println("Running from the dog");
    }
    
    void isFiring()
    {
        System.out.println("Firing in the sky");
    }
    
    void isEating()
    {
        System.out.println("Eating Vada Pav");
    }

}




