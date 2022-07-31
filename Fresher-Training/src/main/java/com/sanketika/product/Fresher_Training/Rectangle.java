package com.sanketika.product.Fresher_Training;
// Area and perimeter of Rectangle
public class Rectangle
{
	    double r;
	    void area(int w,int l)
	    {
	        r=w*l;
	       System.out.println("Area of Rectangle is :" + r);
	    }
	    void perimeter(int w,int l)
	    {
	        r=2*(l+w);
	        System.out.println("perimeter of Rectangle is :" + r);
	    }
}
	class demo
	{
	    public static void main(String[] args) 
	    {
	        Rectangle obj=new Rectangle();
	        obj.area(5,2);
	        obj.perimeter(4,6);
	    }
  }

