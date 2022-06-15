class CellPhone{

    void call()
    {
        System.out.println("Calling...");
    }
}

interface camera
{
    void takePhoto();
    void makeVideo();

    default void make4kVideo()      //default method dont need to define in all the classes which implement this interface
    {
        System.out.println("making 4k video");
    }
}

interface music{
    void playMusic();
}
interface GPS{
    void location();
}

class SmartPhone11 extends CellPhone implements camera, music, GPS{
    
    public void takePhoto()
    {
        System.out.println("Taking photos...");
    }

    
    public void make4kVideo()
    {
        System.out.println("Making 4k vidoe...");
    }

    
    public void makeVideo()
    {
        System.out.println("Making videoss....");
    }

    
    public void playMusic()
    {
        System.out.println("playing");
    }

    public void location()
    {
        System.out.println("Kukshi");
    }
}




public class defaultMethodInInterface {
    public static void main(String[] args) {
        
       
        SmartPhone11 sp = new SmartPhone11();

        sp.call();
        sp.make4kVideo();
        sp.makeVideo();
        sp.playMusic();
        sp.takePhoto();
        sp.location();
    }
}
