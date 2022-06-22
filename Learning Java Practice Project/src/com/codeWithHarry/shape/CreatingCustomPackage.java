package com.codeWithHarry.shape;

class Square{
    int side = 4;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    int area(int s){
        side = s;
        return s*s;
    }
    int perimeter(int s)
    {
        side = s;
        return 4*s;
    }
}
class rectangle{
    int length = 4;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    int breadth = 6;
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    
    int area(int l, int b)
    {
        length = l;
        breadth = b;
        return l*b;
    }
    int perimeter(int l, int b)
    {
        length = l;
        breadth = b;
        return 2*(l+b);
    }
}

//circle and it's shape

class circle{
    int radius = 5;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    float area(int r)
    {
        radius = r;
        return 3.14f*r*r;
    }
    float perimeter(int r)
    {
        radius = r;
        return 2*3.14f*r;
    }
}
class sphere{
    int radius = 3;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    float area(int r)
    {
        return 4*3.14f*r*r;
    }
    float volume(int r)
    {
        return 1.3f*3.14f*r*r*r;
    }
}


public class CreatingCustomPackage{
    public static void main(String[] args) {


        Square sq = new Square();
        int a = sq.area(6);
        System.out.println("The area is square is : "+a);

        
    }
}