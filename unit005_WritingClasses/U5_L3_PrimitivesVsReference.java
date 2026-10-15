package unit005_WritingClasses;

import edhesive.shapes.Circle;

public class U5_L3_PrimitivesVsReference
{

	public static void main(String[] args)
	{
		//Passing by value
		int number = 0;
		System.out.println("First print in main: " + number);
		changeNum(number);
		System.out.println("Second print in main: " + number);
		
		//Pass by reference or class
		Circle c = new Circle();
		System.out.println(c);
		change(c);
		System.out.println(c);
		
		
	}
	
	public static void change(Circle c)
	{
		System.out.println(c);
		c.setRadius(5);
		System.out.println(c);
		
	}

	public static void changeNum(int n)
	{
		System.out.println("First print in the method: " + n);
		n++;
		System.out.println("Second print in the method: " + n);
	}

}
