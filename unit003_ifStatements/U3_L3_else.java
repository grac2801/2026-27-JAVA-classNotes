package unit3_Boolean_ifStatements;

import java.util.Scanner;

public class U3_L3_else
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your numeric grade: ");
		double grade = input.nextDouble();

		if (grade < 60) {
			System.out.println("That is a failing grade.");
		}
		else {
			System.out.println("That is a passing grade.");
		}
		
		/*
		 * Heart rate
		 */
		System.out.println("Heart rate.");
		int heartRate = input.nextInt();
		
		if(heartRate <= 60)
		{
			System.out.println("You must be an athlete.");
		}
		else if(heartRate <= 65)
		{
			System.out.println("You are in great health");
		}
		else if(heartRate <= 69)
		{
			System.out.println("You are in good health");
		}
		else
		{
			System.out.println("You are in poor health");
		}
		
		
		
		/*
		 * STUDENT ACTIVITY: Ask user for the kind of pet she/he likes. Ask for animal to
		 * compare it to. State whether the first letter of each animal name comes before,
		 * after, or if they are the same letter.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		input.close();
	}

}
