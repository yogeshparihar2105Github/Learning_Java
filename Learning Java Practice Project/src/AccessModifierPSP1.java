class superclass{

    protected int a = 5;
    int b = 4;
}

class BaseClass extends superclass{
    void DisplayThePropertiesofSuperClass(){
        System.out.println("a is : "+ a );
        System.out.println("b is : "+ b);
    }
}


public class AccessModifierPSP1 {
    public static void main(String[] args) {
        BaseClass bx = new BaseClass();
        bx.DisplayThePropertiesofSuperClass();    
    }
}
