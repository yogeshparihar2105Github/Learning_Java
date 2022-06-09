public class OOPs {
    public static void main(String[] args) {
        System.out.println("This is Practice of concepts of OOPs in Java : ");
        System.out.println("!So Sit Back And Enjoy!");

        Animals dog = new Animals();

        //Setting the properties of class Animals
        dog.name = "Doggo";
        dog.hasTail = true;
        dog.numberOfLegs = 4;

        //calling the methods of class Animals
        dog.hasTail();
        dog.canTalk();
        dog.canWalk();
        dog.drinkNeat();
        dog.getClass();


    }
}


class Animals //you can not set it public because in java you can only have public class only ones otherwise what you will name that file.
{
    String name;
    int numberOfLegs;
    boolean hasTail;          //by default false

    void canWalk()
    {
        System.out.println("Yes " +name +" can Walk on " + numberOfLegs + " Legs.");
    }

    void canTalk()
    {
        System.out.println("No "+ name +" can not Talk.");
    }

    void drinkNeat()
    {
        System.out.println("Yes "+ name +" can Drink and Eat.");
    }

    void hasTail()
    {
        if(hasTail)
        {
            System.out.println("Yes "+ name + " has a tail");
        }
        else
        {
            System.out.println("No "+ name + " has not a tail");
        }
    }

}