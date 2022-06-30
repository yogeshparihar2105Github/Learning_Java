package ErrorsNExceptions;

public class ErrorsNexception {

public static void main(String[] args) {
    // WithException();
    WithoutExceptionUsingTryNCatch();
}

private static void WithoutExceptionUsingTryNCatch() {
    int a =10;
    int b =0;
    int c = 0;
    try{
        c = a/b;
        //you can use nested try catch here 
    }
    catch(Exception e)
    {
        System.out.println("Oh Oh an Error occured : "+e);
    }
    
    System.out.println("It should run");    //it will not run
}

private static void WithException() {
    int a =10;
    int b =0;
    int c = a/b;
    System.out.println("The value of c is :"+c);    //it will not run
}
    
}
