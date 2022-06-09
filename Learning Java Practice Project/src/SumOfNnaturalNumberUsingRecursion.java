public class SumOfNnaturalNumberUsingRecursion {
    
public static void main(String[] args) {

    // int sumb = SumOfNaturalNumberOf(10);

    // System.out.println(sumb);

    PrinttingFourUsingRecursion(6);


}

private static void PrinttingFourUsingRecursion(int n) {

    if(n>0)
    {
       PrinttingFourUsingRecursion(n-1);
       System.out.println(4);
    }
   
}

public static int SumOfNaturalNumberOf(int n)
{

    if(n == 1)
    {
        return 1;
    }
    return n + SumOfNaturalNumberOf(n-1);
}

}
