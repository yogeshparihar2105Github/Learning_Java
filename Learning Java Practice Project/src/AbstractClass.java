abstract class PhoneModel{

    abstract void switchOn();

    abstract void welcome();

    abstract void greet();

    abstract void switchOff();
  
}
class Xiomi extends PhoneModel{

    @Override
    void switchOn() {
        
        System.out.println("To Switch On Press N Hold Power Button for 3 sec");
        
    }

    @Override
    void welcome() {
        
        System.out.println("Welcome in Xiomi World");
        
    }

    @Override
    void greet() {
        
        System.out.println("Namaste Xiomi ke Phone me aapka swagat hain");
        
    }

    @Override
    void switchOff() {
        System.out.println("To Switch On Press N Hold Power Button for 5 sec");
    }
    
}

class Realme extends PhoneModel{

    @Override
    void switchOn() {
        
        System.out.println("To Switch On Press N Hold Power Button for 1 sec");
        
    }

    @Override
    void welcome() {
        
        System.out.println("Welcome in RealMe World");
        
    }

    @Override
    void greet() {
        
        System.out.println("Namaste RealMe ke Phone me aapka swagat hain");
        
    }

    @Override
    void switchOff() {
        System.out.println("To Switch On Press N Hold Power Button for 2 sec");
    }
    
}


public class AbstractClass {
    public static void main(String[] args) {

        System.out.println("Xiomi Class");
        Xiomi redmi9 = new Xiomi();

        redmi9.switchOn();
        redmi9.welcome();
        redmi9.greet();
        redmi9.switchOff();

        System.out.println("RealMe Class");
        Realme realme5 = new Realme();

        realme5.switchOn();
        realme5.welcome();
        realme5.greet();
        realme5.switchOff();
    }
}
