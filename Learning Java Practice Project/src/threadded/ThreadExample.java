package threadded;

class T1 extends Thread{
    public void run(){

        for(int i=0;i<20;i++)
        {
            System.out.println("T1 is runing..");
        }
        
    }
}


class T2 extends Thread{
    
    public void run(){

        for(int i=0;i<5;i++)
        {
            System.out.println("T2 is runing..");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        //without using threads class 
        //t1 will runn and complete execution
        //then only t2 will run

        T1 t1 = new T1();
        t1.start();
        T2 t2 = new T2();
        t2.start();

        //Now it is running T1 and T2 concurrently i.e. runnig one thing at a time but some time it run T1 and some time it run T2 
        //It doesn't wait for T1 to complete it's execution rather it will runn T2 also.
    }
}
