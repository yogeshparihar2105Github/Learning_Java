import java.util.Scanner;

public class ConvertCelciusToFarenheit {
    public static void main(String[] args) {
        
        System.out.print("Enter the value in Celcius :");

        Scanner sc = new Scanner(System.in);

        float cel = sc.nextFloat();
        
        float far =  Convert(cel);

        System.out.println(far);

    }

    public static float Convert(float celcius)
    {
        float farenheit = celcius*1.8f + 32f;
        return farenheit;

    }
}
