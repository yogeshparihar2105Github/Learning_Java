public class HelloWorldInAMoreDifferentWay {
    public static void main(String[] args) {
        
        String s = PrintHelloWorld(0);

        System.out.println(s);
        
    }

    public static String PrintHelloWorld(int a)
        {
            if(a == 1)
            {
                return "Hello World";
            }
            return "No Hello World";
        }
}
