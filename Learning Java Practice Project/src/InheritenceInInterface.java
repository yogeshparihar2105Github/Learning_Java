//You can use extend keyword to inherit the parent interfaces in child interface and then only implement childInterface in the class and you have excess to all the interface methods

interface camy{
    void TakePhoto();
}
interface GPSss{
    void GiveLocation();
}
interface MediaPlayerrr{
    void Musically();
}

interface ThingsSmartphoneCanDo extends camy,GPSss,MediaPlayerrr{       //Inheritence 
    void obviosllyCall();
}

class Smartphone231 implements ThingsSmartphoneCanDo {
    
    public void TakePhoto (){
        System.out.println("Take Photos..");
    }
    public void GiveLocation(){
        System.out.println("LocationIs..");
    }
    public void Musically()
    {
        System.out.println("Playing Music..");
    }
    public void obviosllyCall(){
        System.out.println("CanAlsoCall..");
    }
}

public class InheritenceInInterface {
    public static void main(String[] args) {
        
        Smartphone231 sm = new Smartphone231();
        sm.Musically();     //you can use all the methods in the smartphone.
    }

}
