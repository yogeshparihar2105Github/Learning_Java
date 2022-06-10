//Base Constructor -> Agar humne base class me constructor banaya he aur derived class ka object banaya he to wo object bhi base class ke constructor ko call karega
//Derived Constructor -> Agar humne derived class me bhi constructor banaya he to bhe pehle base class ka constructor hi call hoga aur uske baad derived class ka constructro call hoga
//Base Constructor Overloaded -> Agar humne base class me constructor ko overload kar diya he to derived class usse invoke/call nahi kar sakti
//Derived Contructor Overloaded -> Agar humne derived class me bhi construtor ko overload kar diya he to bhi derived class base class ke overloaded constructor ko invoke/call nahi kar sakti he
//Derived Constructor Overloaded -> Agar humne derived class ke overloaded constructor ko call kiya he tab bhi base class ka normal constructor to call hoga hi
//Super Keyword -> Agar me derived class ke constructor se base class ke overloaded constructor ko call karwana chahata hu to mujhe super(args) keyword ka use karna hoga aur super(args) mere derived class ke constructro ke andar sabse pehli line me hoga



class Base1{
    int x;

    Base1()
    {
        System.out.println("Base 1 ka constructor");
    }

    Base1(int a)
    {
        System.out.println("a ki Value he : " + a );
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    int y;

    

    Derived1(){
        super(2);
        System.out.println("Aur Me hu Derived 1 ka constructor"); 
    }

    Derived1(int b )
    {
        super(20);
        System.out.println("b ki value he "+b);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
   
}



public class ConstructorInInheritence {
public static void main(String[] args) {
    
    // Base1 b = new Base1(3);
    Derived1 d = new Derived1(6);
}    
}
