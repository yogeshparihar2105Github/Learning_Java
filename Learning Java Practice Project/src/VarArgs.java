public class VarArgs {
    
    public static void main(String[] args) {
    
        int [] array = {1,3,4,56,2,4};

       int avg =  Average(array);
        
        System.out.println(avg);


    }

    static int Average(int...arr) //it will take array;
    {
        int sum = 0;
        for(int a : arr)
        {
            sum = sum + a;
        }

        return sum/arr.length;
    }
}
