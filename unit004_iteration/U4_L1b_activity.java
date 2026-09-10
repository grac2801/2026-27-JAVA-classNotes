package unit004_iteration;

import java.util.Random;
import java.util.Scanner;

public class U4_L1b_activity
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		Random rand = new Random();
		int randomValue = rand.nextInt(100) + 1;

		// for my reference
		System.out.println("Random number = " + randomValue);

		int guess = 0;
		int counter = 1;
		int leftAttempts = 3;
		while (counter <= 3)
		{
			System.out.println("\nEnter an integer value: (1-100)");
			guess = scan.nextInt();
			
			if (randomValue == guess)
			{
				System.out.println("You got it in attempt # " + counter);
				break;
			}
			else if (randomValue < guess)
			{
				System.out.println("Your guess is too high");
			}
			else if (randomValue > guess)
			{
				System.out.println("Your guess is too low");
			}
			leftAttempts--;
			counter++;
			System.out.println("You have " + leftAttempts + " attempts left.");
			if (counter > 3 && randomValue != guess)
			{
				System.out.println("\nYou exhausted your attempts. Call the FBI");
			}
		}

		scan.close();
	}

}
