//If you make a obj of type phone then you can call all the method of the phone but cant call methods that are only present in smartphone


class Phone{

    void greet()
    {
        System.out.println("Good Morning");
    }

    void turningOn()
    {
        System.out.println("Turning on Phone...");
    }


}

class SmartPhone extends Phone{

    void swagat()
    {
        System.out.println("Swagat Hain");
    }

    
    void turningOn()
    {
        System.out.println("Turning on SmartPhone...");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Phone obj = new SmartPhone();

        obj.turningOn();

        SmartPhone obj1 = new SmartPhone();

        obj1.swagat();
       
        
    }
}
