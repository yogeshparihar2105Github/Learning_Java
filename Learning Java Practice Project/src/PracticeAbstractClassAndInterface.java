//Problem 1 

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    public void write()
    {
        System.out.println("Writing..");
    }
    public void refill()
    {
        System.out.println("Refilling...");
    }
    void changeNib()
    {
        System.out.println("Change the Nib. ");
    }
}

//problem 2

class Monekey{
    void jump()
    {
        System.out.println("Jumping.");
    }

    void bite(){
        System.out.println("Biting..");
    }
}
interface BasicAnimal{
    void sleep();
    void eat();
}

class Human extends Monekey implements BasicAnimal{

    public void sleep()
    {
        System.out.println("Sleepingl..");
    }
    public void eat()
    {
        System.out.println("Eatingl.");
    }

    @Override
    void bite() {
        System.out.println("Human can also bite but not like monkey");
    }
}


//Problem 3

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnet();
}

class Smartphoneeee extends Telephone{

    public void ring(){
        System.out.println("Ringing...");
    }

    void ring(int n)        //Polymorphism of ring()
    {
        n = 9999;
        System.out.println("call from "+n);
    }

    public void lift(){
        System.out.println("lifting...");
    }

    public void disconnet(){
        System.out.println("disconneted...");
    }


}


//Problem4

interface TvRemote{
    void changeTheChannel();
}
interface SmartTvRemote extends TvRemote{
    void changeTheVolume();
}

class TV implements TvRemote{
    public void changeTheChannel(){
        System.out.println("Channel is changing");
    }
}


class PracticeAbstractClassAndInterface{
    public static void main(String[] args) {
        
    }
}