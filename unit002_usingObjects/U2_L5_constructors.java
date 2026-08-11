package unit002_usingObjects;
import edhesive.shapes.Circle;
import edhesive.shapes.Rectangle;
import edhesive.shapes.RegularPolygon;

public class U2_L5_constructors
{

	public static void main(String[] args)
	{
		System.out.println("********************");
		System.out.println("Default circle");
		System.out.println("********************");
		Circle c = new Circle();
		System.out.println(c);
		
		System.out.println("********************");
		System.out.println("Circle with a set double parameter");
		System.out.println("********************");
		Circle c1 = new Circle(5.587);
		System.out.println(c1);
		//special common method -> toString()
		System.out.println(c1.toString());
		
		System.out.println("********************");
		System.out.println("methods for circles");
		System.out.println("********************");
		System.out.println("area of c1: " + c1.getArea());
		c1.setRadius(5.87);
		System.out.println("area of c1: " + c1.getArea());
		
		System.out.println("********************");
		System.out.println("Rectangles");
		System.out.println("********************");
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3.0);
		Rectangle r3 = new Rectangle(4.0, 5.0);
		System.out.println("toString: " + r3.toString());
		System.out.println("toString: " + r2.toString());
		System.out.println("toString: " + r1.toString());
		
		System.out.println(r1 + "\n" + r2 + "\n" + r3);
		
		
		System.out.println("********************");
		System.out.println("Regular polygon");
		System.out.println("********************");
		
		RegularPolygon rp1 = new RegularPolygon(10, 5);
		System.out.println(rp1);
		RegularPolygon rp2 = new RegularPolygon(4);
		System.out.println(rp2);
		
		
		
		
		
		
	}

}
