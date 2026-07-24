package unit001_primitives;

import java.util.Scanner;

public class U1_L2_userInputVariables
{

	public static void main(String[] args)
	{
		System.out.println("***************************************");
		System.out.println("Setting up my scanner");
		System.out.println("***************************************");
		Scanner scan = new Scanner(System.in);
		String name;
		
		System.out.println();
		System.out.println("***************************************");
		System.out.println("Getting someone's name and age as input");
		System.out.println("***************************************");
		
		// Ask the person's name
		System.out.println("What is your name? ");
		name = scan.nextLine();
		System.out.println("Hello " + name + ". It is nice to meet you.");
		
		//Ask the person's age
		System.out.println();
		System.out.println("What is your age? ");
		int myAge = scan.nextInt();
		System.out.println("So, your name is " + name + ", and your age is: " + myAge);
		
		System.out.println();
		System.out.println("***************************************");
		System.out.println("Scanner bug");
		System.out.println("***************************************");
		//Last input was an integer
		//solution = scan.nextLine()
		
		scan.nextLine();/**/
		String snack = "";
		System.out.println("What is your favorite snack?");
		snack = scan.nextLine();
		System.out.println("Your favorite snack is " + snack);

		
		scan.close();
	}

}
