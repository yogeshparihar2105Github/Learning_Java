interface Cycle{

    int a = 4; // you can not change the value of a because it is final
    public void speedUp(); // since all the method are public so you do not need to use public keyword
    abstract void brake(); // since all methods in interface are abstract you do not need to use the abstract keyword
}
interface hornBlow{
    void blowHorn();
}


class phone232{
    void phnnd()
    {
        System.out.println("sojddsfoidijf");
    }
}

//you can implements multiple interfaces but can not extend multiple classes.
class HeroCycle implements Cycle, hornBlow{

    void slip() // you can define any method which is not in interface also
    {
        System.out.println("Slipping the cycle using brakes");
    }

    public void speedUp(){ // since all the methods are defined public in the interface you have to use public keyword
        System.out.println("speeding up...");
    }
    public void brake(){
        System.out.println("Brakiing...");
    }
    public void blowHorn()
    {
        System.out.println("Po Po Po Po");
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        
        HeroCycle hc = new HeroCycle();

        hc.speedUp();
        hc.brake();
        hc.blowHorn();
        System.out.println(hc.a); 
        // hc.a = 6;     //you cannot change the properties value of interface as they are final.
        // System.out.println(hc.a);      

        hc.slip();
    }
}
