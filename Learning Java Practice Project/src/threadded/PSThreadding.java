package threadded;

class Thred1 extends Thread{
    @Override
    public void run() {
        
        System.out.println("Runnign");
    }
    Thred1(String greet){
        super(greet);
    }
}


public class PSThreadding {

  public static void main(String[] args) {

    Thred1 t = new Thred1("Welcom");
    t.start();
    System.out.println(t.getName());
    
    Thred1 t1 = new Thred1("Good Morning");
    t1.start();
    System.out.println(t1.getName());
  }
    
}
