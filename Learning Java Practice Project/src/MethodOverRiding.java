class A{

    void meth1(){

        int a = 10;
        int b = 12;

        System.out.println("This is meth 1 of class A");
        System.out.println("The value of a is : "+a);
        System.out.println("The value of b is : "+b);
    }
}

class B extends A{

    @Override       //It's not necessary to write this but it is a good practice to do this so that in future you won't get any doubt about overriding.
    void meth1(){

        int a = 15;

        System.out.println("This is meth 1 of class B");
        System.out.println("The value of a is : "+a);
    }
}



public class MethodOverRiding {
    public static void main(String[] args) {
        
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();

    }
}
