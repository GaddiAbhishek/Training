import java.util.Scanner;

class Areacalculation
{
	double area1,area2,area3;
	void circle(double r)
	{
		area1=3.14*r*r;
		
	}
 void rectangle(double w,double l)
	{
		area2=w*l;
		System.out.println("Area of rectangle :" + area2);
	}
	void square(double a)
	{
		area3=a*a;
		System.out.println("Area of Square : " + area3);
	}
	
}
class AreaCalculation
{
	double area;
	void circle(double r)
	{
	 area= (22*r*r)/7;
	}
}
class AreaOfCircle extends AreaCalculation
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();      
      AreaOfCircle  a=new AreaOfCircle();
      a.circle(rad);
      System.out.println("Area of Circle is: " + a.area);      
   }
 }

	
	
	
	
	
	
	
	