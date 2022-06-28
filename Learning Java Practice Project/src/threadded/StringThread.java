package threadded;

class Mytherd extends Thread{


    Mytherd(String name)
    {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Runn");
    }


    
}



class StringThread {
    public static void main(String[] args) {
                
        Mytherd my = new Mytherd("Yogesh");
        my.start();
        System.out.println(my.getName());


        
    }
}