import javax.print.FlavorException;

class Circle{
    int radius;

    float area(int rad)
    {
        this.radius = rad;

        float area = 3.14f * radius * radius;

        return area;
    }
}
class Cylinder extends Circle{
    int height;

    float area(int rad,int heit)
    {
        this.radius = rad;
        this.height = heit;

        float area = (2*3.14f*radius)+(2*3.14f*radius*radius);
        return area;
    }

    float volume(int rad, int heit)
    {
        float volu = (3.14f*rad*rad*heit);
        return volu;
    }
}

class Rectangle{
    int length;
    int breadth;

}
class Cuboid extends Rectangle{
    int depth;
}

public class PracticeOfClassNmethods{
    public static void main(String[] args) {
        
    }
}