public class StarPrintingUsingRecursion {
    
    public static void main(String[] args) {
        
        PrintStars(4);
    }

    private static void PrintStars(int n) 
    {
        if(n>0)
        {
            PrintStars(n-1);
            for(int i = 0;i<n;i++)
            {  
                System.out.print("*");               
            }
            System.out.println("");
        }
    }
}
