//WITHOUT CONSTRUCTOR
class Cylinder11{
    
    int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }


    public float Volume(int radius, int height)
    {
        float vol = 3.141f * radius * radius * height;
        return vol;
    }

    public float SurfaceArea(int radius, int height)
    {
        //A=2πrh+2πr2
        float surfArea =  (2 * 3.141f * radius * height) + (2 * 3.141f * radius * radius);
        return surfArea;
    }

}

//WITH CONSTRUCTOR
class Cylinderr{

    int radius;
    int height;

    Cylinderr(int rad, int heigt)
    {
        radius = rad;
        height = heigt;
    }

    public float Volume()
    {
        float vol = 3.141f * radius * radius * height;
        return vol;
    }

    public float SurfaceArea()
    {
        //A=2πrh+2πr2
        float surfArea =  (2 * 3.141f * radius * height) + (2 * 3.141f * radius * radius);
        return surfArea;
    }
}

class InitializeRectangel{
    int radius;
    int height;

    InitializeRectangel()
    {
        radius = 4;
        height = 5;

    }

    InitializeRectangel(int rad, int heig)
    {
        radius = rad;
        height = heig;
    }
}

public class PracticeProblemsOfClassesAndObjects {
    public static void main(String[] args) {

/*WITHOUT CONSTRUCTOR        
    //Set N Get the height N radius of cylinder

        Cylinder clinder = new Cylinder();

        clinder.setHeight(12);
        int heigt = clinder.getHeight();
        System.out.println("Height of the cylinder : "+heigt);

        clinder.setRadius(3);
        int rad = clinder.getRadius();
        System.out.println("Radius of the cylinder : "+rad);

       float surfAra =  clinder.SurfaceArea(rad, heigt);

       float volu =  clinder.Volume(rad, heigt);

       System.out.println("The Surface Area of Cylinder with Height "+heigt+" And Radius of "+rad+" is : "+surfAra);
       System.out.println("The Volume of Cylinder with Height "+heigt+" And Radius of "+rad+" is : "+volu);
      
*/      
      
/*WITH CONSTRUCTOR
        Cylinderr clidr = new Cylinderr(4, 10);
        float volu = clidr.Volume();
        float suaa = clidr.SurfaceArea();

        System.out.println("The Surface Area of Cylinder is : "+suaa);
        System.out.println("The Volume of Cylinder is : "+volu);
        
*/

      
/*Initializing REctangle
        InitializeRectangel rect = new InitializeRectangel(3, 7);
        System.out.println("Radius : "+rect.radius +" Height : " + rect.height);

*/
        Sphere sphe = new Sphere();
        sphe.setRadius(4);
        System.out.println("Volume of the Sphere : "+sphe.Volume());
        System.out.println("Surface Area of the Sphere : "+sphe.SurfaceArea()); 

    }
}


class Sphere{
    
    int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float Volume()
    {
        float vol = 1.33f * 3.141f * radius * radius * radius;
        return vol;
    }

    public float SurfaceArea()
    {
        float surfArea =  4 * 3.141f * radius * radius;
        return surfArea;
    }

}