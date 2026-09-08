package unit3_Boolean_ifStatements;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U3_L1_simpleIfs
{

	public static void main(String[] args)
	{
		int x = 5;
		if (x == 5) 
		{
			System.out.println("x is equal to 5");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many legs does your pet have? ");
		int legs = scan.nextInt();
		if(legs == 4)
		{
			System.out.println("It is a dog!");
			System.out.println("It could be a cat!");
			System.out.println("It is a rat!");
		}
		
		/*
		 * Guessing game
		 */
		int rand = ThreadLocalRandom.current().nextInt(10) + 1;
		System.out.println("rand = " + rand);
		
		//user guesses
		System.out.println("Enter a number between 1 and 10: ");
		int guess = scan.nextInt();
		
		//test
		if(rand == guess)
		{
			System.out.println("You guessed correctly");
		}
		if(rand != guess)
		{
			System.out.println("You did not guess correctly");
		}

		scan.close();
		

	}

}
