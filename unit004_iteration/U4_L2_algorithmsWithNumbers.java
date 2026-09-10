package unit004_iteration;

import java.util.Scanner;

public class U4_L2_algorithmsWithNumbers
{

	public static void main(String[] args)
	{
		/*
		 * Algorithm for evenly divisible
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the larger integer: ");
		int large = scan.nextInt();

		System.out.println("Enter the smaller integer: ");
		int small = scan.nextInt();

		if (large % small == 0)
		{
			System.out.println(large + " is divisible by " + small);
		}
		else
		{
			System.out.println(large + " is NOT divisible by " + small);
		}

		/*
		 * Algorithm for removing one digit at a time
		 */
		System.out.println("Enter a large number: ");
		int number = scan.nextInt();

		while (number > 0)
		{
			int digit = number % 10;
			System.out.println(digit);
			number /= 10;
		}

		/*
		 * Sentinel counter. Ask students to code the largest number input until -1 gets
		 * typed in.
		 */
		System.out.println("Enter an integer. -1 to end");
		int num = scan.nextInt();
		int largest = num;

		while (num != -1)
		{

			// if moved from after sout below. Otherwise
			// -1 is an input
			if (num > largest)
			{
				largest = num;
			}
			System.out.println("Enter an integer. -1 to end");
			num = scan.nextInt();

		}
		System.out.println("The largest value is " + largest);

		/*
		 * Show students the code below and and ask them to trace and show results
		 */

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		while (a >= b)
		{
			a -= b;
			c++;
		}

		System.out.println("c: " + c);

		scan.close();

	}

}
