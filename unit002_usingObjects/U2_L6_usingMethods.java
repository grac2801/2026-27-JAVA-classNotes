package unit002_usingObjects;

import edhesive.shapes.Circle;
import edhesive.shapes.RegularPolygon;

public class U2_L6_usingMethods
{

	public static void main(String[] args)
	{
		/*
		 * Create a circle
		 */
		Circle c = new Circle();
		c.setRadius(9);
		double area = c.getArea();
		c.setRadius(2);
		area = c.getArea();
		System.out.println(c.getArea());
		System.out.println(area);
		
//		double circumference = c.getCircumference();
		System.out.println("circumference: " + c.getCircumference());
		
		System.out.println(c.getClass());
		
		RegularPolygon poly = new RegularPolygon(7);
		System.out.println(poly);
		poly.addSides(2);
		System.out.println(poly);
		
		//Main point = differentiate between void and non-void methods
		//void --> nothing returned
		//non-void --> can be saved in a variable. They are explained in 
		//the API
		
		
	}

}
