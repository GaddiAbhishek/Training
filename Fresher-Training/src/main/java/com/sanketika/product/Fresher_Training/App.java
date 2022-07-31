package com.sanketika.product.Fresher_Training;
import java.util.Scanner;
/*class app1

{
	void computeProperties(int shape) 
	{
	    System.out.println("enter the case :\n");
		Scanner sc=new Scanner(System.in);
		shape=sc.nextInt();
		
		switch(shape)
		{
		case 1:System.out.println("abhi");
		break;
		case 2:System.out.println("Shek");
		break;
	
		}
		
	}
}
*/
public class App 
{
    public static void main( String[] args )
    {
         Rectangle demo=new Rectangle();
         Circle demo1=new Circle();
         Square demo2=new Square(); 
         demo.area(5,2);
         demo.perimeter(8, 4);
         demo1.area(2);
         demo1.perimeter(5);
         demo2.area(6);
         demo2.perimeter(3);
        
    }
}
