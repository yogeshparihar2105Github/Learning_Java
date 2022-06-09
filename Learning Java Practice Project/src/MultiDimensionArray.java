public class MultiDimensionArray {
    public static void main(String[] args) {
        
        //Declaring and Initializing Matrix1
        int [][] matrix1 = new int[2][3];
        matrix1[0][0] = 12;
        matrix1[0][1] = 5;
        matrix1[0][2] = 6;
        matrix1[1][0] = 2;
        matrix1[1][1] = 65;
        matrix1[1][2] = 15;

        //Declaring and Initializing Matrix2
        int [][] matrix2 = new int[2][3];
        matrix2[0][0] = 45;
        matrix2[0][1] = 65;
        matrix2[0][2] = 56;
        matrix2[1][0] = 5;
        matrix2[1][1] = 5;
        matrix2[1][2] = 1;

        //Printing Matrix1 
        System.out.println("Matrix1");
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j =0;j<matrix1[i].length;j++)
            {
                System.out.print(matrix1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


        System.out.println("+");


        //Printing Matrix1 
        System.out.println("Matrix2");
        for(int i=0;i<matrix2.length;i++)
        {
            for(int j =0;j<matrix2[i].length;j++)
            {
                System.out.print(matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


        
        //Declaring and Memory Allocation of SummedMatrix
        int [][] SummedMatrix = new int[2][3];


        System.out.println("=");


        //Printing SummedMatrix
        System.out.println("SummedMatrix");
        for(int i=0;i<SummedMatrix.length;i++)
        {
            for(int j =0;j<SummedMatrix[i].length;j++)
            {
                System.out.print(matrix1[i][j]+matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }


}
