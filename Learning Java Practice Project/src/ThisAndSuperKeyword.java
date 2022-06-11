class EkClass{

    int a;

    public int getA() {
        return a;
    }

    EkClass(int a)
    {
        this.a = a;
    }



}



public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        
        EkClass e = new EkClass(5);
        System.out.println(e.getA()); 
    }

}
