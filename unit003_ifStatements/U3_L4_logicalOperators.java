package unit003_ifStatements;

import java.util.Scanner;

public class U3_L4_logicalOperators
{

	public static void main(String[] args)
	{
		/*
		 * and = &&
		 * or  = ||
		 * not = !
		 */
		
		int x = 4;
		int y = 9;
		
		//and operator [both must be true]
		boolean first = (x < 10) && (y > 5);
		System.out.println("First: " + first);
		
		// or operator [At least one has to be true]
		boolean second = (x < 10) || (y > 5);
		System.out.println("second: " + second);
		
		// not operator
		x = 5;
		boolean third = !(x == 5);
		System.out.println("third: " + third);
		boolean fourth = (x != 5);
		System.out.println("fourth: " + fourth);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		
		if(num >= 0 && num <= 100)
		{
			System.out.println("Number is between 0 and 100 inclusive");
		}
		if(num < 0 || num > 100)
		{
			System.out.println("Number is not valid!!");
		}
		if(!(num == 75))
		{
			System.out.println("Number is not 75");
		}
		
		// Student activity
		/*
		 * input an int and test if it is not between 25 and 75 exclusive. print:
		 * "not between 25 and 75"
		 */
		System.out.println("Enter digit to check: ");
		int newNum = input.nextInt();
		//solution 1
		if(!(newNum > 25 && newNum < 75))
		{
			System.out.println("Number is not between 25 and 75");
		}
		
		//solution 2
		if(newNum <= 25 || newNum >= 75)
		{
			System.out.println("Number is not between 25 and 75");
		}
		
		
		input.close();
		
	}

}
