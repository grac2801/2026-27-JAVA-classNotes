package unit004_iteration;

import java.util.Scanner;

public class U4_L1_whileLoop
{

	public static void main(String[] args)
	{
		/*
		 * Program 1: positive numbers
		 */
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a positive integer: ");
//		int num = scan.nextInt();
//		int count = 1;
//		
//		while(num < 0)
//		{
//			System.out.println("You entered a negative number. Try again.");
//			System.out.println("Enter a positive integer: ");
//			num = scan.nextInt();
//			count++;
//		}
//		
//		System.out.println(num + " is a positive number.");
//		System.out.println("It only took you " + count + " times.");
		
		/*
		 * Program 2: scores
		 */
		System.out.println("Enter your test grade: ");
		int grade = scan.nextInt();

		int counter = 1;
		int sum = grade;

		while (grade != -1)
		{
			System.out.println("Enter another grade. -1 to stop: ");
			grade = scan.nextInt();
			if(grade == -1)
			{
				sum += 0;
				break;
			}
			counter++;
			sum += grade;
		}


		double average = sum / counter;
		System.out.printf("The average is: %,.2f" + "%%", average );

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		scan.close();
		
	}

}
