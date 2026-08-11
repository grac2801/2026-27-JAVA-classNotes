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
		
		/*
		 * CIRCLES Instantiate a new circle with a radius of 15.879856565 ft. (air
		 * balloon) print it to make sure you have done it correctly get the
		 * circumference and the area for this circle. 
		 * Print it. The balloon loses some gas, therefore deflating. Now change the radius to 
		 * 12.45458724 ft and get the circumference and area values
		 * again.
		 * 
		 * RECTANGLES instantiate a 1x1 ft and 5x5 ft rectangles. Additionally, a 6x4
		 * rectangle as well. Change the width of the second rectangle to
		 * 7.5 ft. How much more area did you gain with this change from the original
		 * area value? Change the W and L of the third rectangle to 5x3. Print a
		 * statement displaying the area, length, perimeter and width of this new
		 * object.
		 * 
		 * 
		 * POLYGONS Instantiate a triangle with all sides being 5 ft in length. Make it
		 * a pentagon with same length of sides. [Shape A]
		 * 
		 */
		
		
		
		
		
	}

}
