class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class InheritenceExample {
    public static void main(String[] args) {
        
        Base b = new Base();
        b.setX(5);
        System.out.println("This is X value set by b : "+b.getX());

        Derived d = new Derived();
        d.setX(7);
        System.out.println("This is X value set by d : "+d.getX());

        
    }
}
