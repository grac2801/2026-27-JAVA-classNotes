package unit005_WritingClasses;

import java.util.Scanner;

import edhesive.shapes.Circle;

public class U5_L4_returnMethods
{

	public static void main(String[] args)
	{
		Circle c = new Circle(3);
		double a = c.getArea();
		System.out.printf("The area is %-5.2f%n%n", a);
		
		
		int larger1 = whichLargerOfTheseTwo_Math(4, 5);
		System.out.println("The largest of the two numbers is: " + larger1);
		
		int larger2 = whichLargerThanTheseTwo_returns(45, 7);
		System.out.println("The largest of the two numbers is: " + larger2);
		
		//Get an average
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scan.nextDouble();
		System.out.println("Enter the third number: ");
		double num3 = scan.nextDouble();
		
		System.out.printf("The average is: %-5.2f%n%n", average(num1, num2, num3));
		
		
		scan.close();
	}

	public static int whichLargerThanTheseTwo_returns(int i, int j)
	{
		if(i > j)
		{
			return i;
		}
		return j;
	}

	public static double average(double num1, double num2, double num3)
	{
		return(num1 + num2 + num3) / 3;
	}

	public static int whichLargerOfTheseTwo_Math(int i, int j)
	{
		int largerOne = Math.max(i, j);
		return largerOne;
	}

}
