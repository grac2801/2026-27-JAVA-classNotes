package unit001_primitives;

import java.util.Scanner;

public class U1_L5_modulus
{

	public static void main(String[] args)
	{
		int num1 = 14 % 5;
		System.out.println(num1);
		
		/*
		 * useful for:
		 * patterns, even or odd
		 * time calculations
		 * money
		 * online encryption
		 * animation and video games
		 */
		
		System.out.println("Is 1250 divisible by 20? ");
		int twenties = 1250 % 20;
		System.out.println(twenties);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a whole number: ");
		int x = scan.nextInt();
		
		System.out.println("Enter another whole number: ");
		int y = scan.nextInt();
		
		System.out.println("Division " + x + "/" + y + " = " + (x / y));
		System.out.println("Division " + x + "%" + y + " = " + (x % y));
		
		
		//To find whether odd or even
		System.out.println(x % 2);
		// if 0 --> even, otherwise --> odd
		
		
		/*
		 * Use mod to find the last digit
		 */
		int myNum = 15268;
		System.out.println("The last number is: " + myNum % 10);
		System.out.println("The last two numbers are: " + myNum % 100);
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
