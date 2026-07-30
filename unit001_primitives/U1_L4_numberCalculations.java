package unit001_primitives;

import java.util.Scanner;

public class U1_L4_numberCalculations
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num1 = 15;
		int num2 = 5;
		System.out.println(num1 + num2);
		
		
		int x = 5;
		int y = 4;
		int z = x + y * y;
		System.out.println("z = " + z);
		
		int a = 3;
		System.out.println("a / 2 = " + (a / 2));
		System.out.println("a / 2 = " + ( 1.0 * a / 2));//it works correctly
		System.out.println("a / 2. = " + (a / 2.));//it works correctly
		System.out.println("a / 2 = " +  1.0 * (a / 2));//it works correctly
		
		//another example
		int myInt = 9;
		double b = myInt /2;
		System.out.println("b = " + b);
		
		System.out.println("********************");
		System.out.println("Student exercise");
		System.out.println("********************");
		/*
		 * Ask the user to input 3 integers, and then
		 * you will get the correct average of them
		 * correctly.
		 */
		
		System.out.println("********************");
		System.out.println("shortcuts");
		System.out.println("********************");
		int myNumber = 50;
		System.out.println(myNumber);
		myNumber = myNumber + 1;
		System.out.println(myNumber);
		myNumber += 1;
		System.out.println(myNumber);
		
		myNumber -= 10;
		System.out.println(myNumber);
		
		myNumber *= 4;
		System.out.println(myNumber);
		
		myNumber /= 10.0;
		System.out.println(myNumber);
		
		//to add one [unary operators]
		myNumber++;
		System.out.println(myNumber);
		myNumber--;
		System.out.println(myNumber);
		++myNumber;
		System.out.println(myNumber);
		scan.close();
	}

}
