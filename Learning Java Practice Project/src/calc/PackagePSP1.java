package calc;

class calculator{
    void Calculate(int a , int b)
    {
        System.out.println("The Result is : " + (a+b));
    }
}

class SCintificcalculator{
    void Calculate(int a , int b)
    {
        System.out.println("The Result is : " + Math.sin(a+b));
    }
}

class Hybridcalculator{
    void Calculate(int a , int b)
    {
        System.out.println("The Result is : " + (a+b));
        System.out.println("The Result is : " + Math.sin(a+b));
    }
}


public class PackagePSP1 {
    public static void main(String[] args) {

        SCintificcalculator s = new SCintificcalculator();
        s.Calculate(5, 6);


        Hybridcalculator hc = new Hybridcalculator();
        hc.Calculate(5, 6);
        
    }
}
