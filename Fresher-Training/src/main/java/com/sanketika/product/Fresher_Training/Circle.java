package com.sanketika.product.Fresher_Training;
// area and perimeter of circle
public class Circle {
    double R;
    void area(int r )
    {
        R=3.14*r*r;
       System.out.println("Area of circle is :" + R);
    }
    void perimeter(int r)
    {
        R=2*3.14*r;
        System.out.println("perimeter of circle is :" + R);
    }
}
class demo1
{
    public static void main(String[] args) 
    {
        Circle obj=new Circle();
        obj.area(5);
        obj.perimeter(4);
    }
}

