package unit3_Boolean_ifStatements;

import java.util.Scanner;

public class U3_L2_relationalOperators
{

	public static void main(String[] args)
	{
		/*
		 * ==, <, >, <=, >=, !=
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade: ");
		double grade = input.nextDouble();

		if (grade < 60) {
			System.out.println("That is a failing grade");
		}
		if (grade >= 60) {
			System.out.println("That is a passing grade");
		}

		
		
		/*
		 * Write a program for a long distance jump. If >= 8.95 meters, then ask
		 * for the name of the athlete, and her/his height in inches, as well as
		 * nationality. Use printf and display as follows: 
		 * The length of the jump is: 9.99 
		 * The name is James Walker 
		 * She/He is from United States
		 * height of the athlete in ft. and inches.
		 */
		
		
		
		input.close();
	}

}
