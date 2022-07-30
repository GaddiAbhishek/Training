package com.sanketika.product.Fresher_Training;

public class Areacal {
	double a;
	// areaofcircle
	void area(double r)
	{
		a=3.14*r*r;
		System.out.println("Area of circle is :" + a);
	}
	// area of Rectangle
	void area(double w,double l)
	{
		a=w*l;
		System.out.println("Area of Rectangle :" + a);
	}
	// area of Square
	void area(int A)
	{
		a=A*A;
		System.out.println("Area of Square :"+ a);
	}
}
class areacalculation
{
	public static void main(String[] args) {
		Areacal obj=new Areacal();
		obj.area(5);
		obj.area(10, 7);
		obj.area(5);
	}
}
