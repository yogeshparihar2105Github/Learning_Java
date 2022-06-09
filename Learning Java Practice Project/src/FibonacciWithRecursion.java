public class FibonacciWithRecursion {
public static void main(String[] args) {
    int n = 6;

    int result = fibonaaci(n);

    System.out.println(result);
}    

static int fibonaaci(int n )
{
    if(n == 1)
    {
        return 0;
    }
    else if (n==2)
    {
        return 1;
    }

    return fibonaaci(n-1) + fibonaaci(n-2);
}

}


