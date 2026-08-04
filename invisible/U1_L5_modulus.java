package invisible;

import java.util.Scanner;

public class U1_L5_modulus
{

	public static void main(String[] args)
	{
		int num1 = 14 % 5;
		System.out.println(num1);
		
		/*
		 * Useful for:
		 * patterns, even or odd values
		 * time calculations
		 * money
		 * online encryption
		 * animation in video games
		 */
		
		System.out.println("is 1280 divisible by 20? ");
		int twenties = 1280 % 20;
		System.out.println(twenties);
		
		//Mod only works for integers
		int num = 14;
		num %= 5;
		System.out.println(num);
		
		
		//From lesson
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int x = scan.nextInt();
		
		System.out.println("Enter another whole number: ");
		int y = scan.nextInt();
		
		System.out.println("Division " + x + " / " + y + " = " + (x / y));
		System.out.println("Division " + x + " % " + y + " = " + (x % y));
		
		/*
		 * Use mod to find if a number is even or odd
		 * 0 means even, 1 means odd
		 */
		System.out.println(x % 2);
		
		
		/*
		 * Use mod to find the one's digit
		 */
		int myNum = 12589;
		System.out.println("The last digit of number " + myNum + " is: " + myNum % 10);
		System.out.println("The last 2 digits of number " + myNum + " are: " + myNum % 100);
		
			
		/*
		 * we can not divide by zero
		 * we can not use mod by zero either
		 * you will get the ArithmeticException error
		 */
		scan.close();
		
		
		
		
		
	}

}
