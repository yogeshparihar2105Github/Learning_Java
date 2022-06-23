//This is anotherr way to create thread
package threadded;

class c1{
    void doSomething()
    {
        System.out.println("This is C1");
    }
}

//suppose you have this condition and now you want to use thread class how to do it, easy just use Thread interface 
class C2 extends c1 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<20;i++)
        {
            System.out.println("C2 is running..");
        }
        
    }
}

class C3 implements Runnable{

    @Override
    public void run() {
        
        for(int i=0;i<20;i++)
        {
            System.out.println("C3 is running..");
        }
            
    }  

}

public class InterfaceThreadexaple {
 public static void main(String[] args) {
    
    /*since we are not extending from the Thread class we have to make an object
    of Thread class then only we can use start() of Thread class*/


    C2 bullet1 = new C2();
    Thread Gun1 = new Thread(bullet1); //you have to pass the object of C2 as argument in Thread constructor
    
    Gun1.start(); //then only you can use start() method of Thread Class

    C3 bullet2 = new C3();
    Thread Gun2 = new Thread(bullet2);

    Gun2.start();
 }   
}
