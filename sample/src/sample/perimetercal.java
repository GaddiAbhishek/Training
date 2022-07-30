package sample;
class peri
{
	double p;
	// perimeter of circle
	void perimeter(double r)
	{
		p=2*3.14*r;
		System.out.println("perimeter of circle :" + p);
	}
	// perimeter of rectangle
	void perimeter(double l,double w)
	{
		p=2*(l+w);
		System.out.println("perimeter of rectangle :" + p);
	}
	// perimeter of square
	void perimeter(int a)
	{
		p=4*a;
		System.out.println("perimeter of square :" + p);
	}
}
class perimetercal
{
   public static void main(String[] args)
     {
	   peri obj=new peri();
	   obj.perimeter(5.0);
	   obj.perimeter(6,4);
	   obj.perimeter(4);
	
	
}
}
