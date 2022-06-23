class Practicese{
    public static void main(String[] args) {
        
        DownStairsStarPrinting();
        UpStairsStarPrinting();
    }

    private static void DownStairsStarPrinting() {
        System.out.println("Star Printing Down Stairs");

        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    private static void UpStairsStarPrinting() {
        System.out.println("Star Printing Up Stairs");

        for(int i=0;i<=5;i++)
        {
           for(int j=5;j>=i;j--)
           {
                System.out.print(" ");
                if(j==i)
                {
                    for(int k=0;k<=i;k++)
                    {
                        System.out.print("*");
                    }
                }
           }
           System.out.println("");
        }
    }
}