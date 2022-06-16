interface cam{
    void TakePhoto();
}
interface GPSs{
    void GiveLocation();
}
interface MediaPlayerr{
    void Musically();
}


class Smartphone23 implements cam,GPSs,MediaPlayerr{
    
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
}

class PolymorphismInInterface {
    public static void main(String[] args) {
        
        GPSs gp = new Smartphone23();
        gp.GiveLocation();      // gb is a object of type GPSs it is an object of smartphone class but it can only call methods that is present in GPSs only

        Smartphone23 sp = new Smartphone23();
        sp.GiveLocation();
        sp.Musically();         // sp is a object of type Smartphone23 and it is an object of smartphone23 so it can call all the methods that are in smartphone23 class.
        sp.TakePhoto();         
    }
}