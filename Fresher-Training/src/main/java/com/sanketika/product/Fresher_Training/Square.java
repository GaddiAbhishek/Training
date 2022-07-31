package com.sanketika.product.Fresher_Training;

public class Square {
	 double R;
	    void area(int a)
	    {
	        R=a*a;
	       System.out.println("Area of square is :" + R);
	    }
	    void perimeter(int a)
	    {
	        R=4*a;
	        System.out.println("perimeter of square is :" + R);
	    }
	}
	class demo2
	{
	    public static void main(String[] args) 
	    {
	        Square obj=new Square();
	        obj.area(5);
	        obj.perimeter(4);
	    }
	}


