package unit001_primitives;

import java.util.Scanner;

public class U1_L3_dataTypes
{

	public static void main(String[] args)
	{
		//typing integers
		System.out.println(1 + 2);
		System.out.println("1" + "2");
		
		/*
		 * Let's try String data types
		 */
		System.out.println("Jelly" + "fish");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an int: ");
		int x = scan.nextInt();	
		System.out.println(x * 5);
		
		System.out.println("Enter a double: ");
		double y = scan.nextDouble();	
		System.out.println(y * 5);
		
		scan.nextLine();//Scanner bug
		System.out.println("Enter a String: ");
		String z = scan.nextLine();	
		System.out.println("z + z = " + (z + z));
		
		System.out.println("Enter a boolen: ");
		boolean bool = scan.nextBoolean();	
		System.out.println("you selected: " + bool);
		
		
		//limits
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		//double limits
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		
		float first = 3.5F;
		float second = 8.95487F;
		System.out.println("first + second: " + (first + second));
		
		long long1 = 387_657_789L;
		long long2 = 111_657_754L;
		System.out.println("long1 + long2: " + (long1 + long2));
		
		//next() vs nextLine()
		System.out.println("Enter the capital of Brasil: ");
		String country1 = scan.next();
		System.out.println("You entered: " + country1);
		
		scan.nextLine();
		System.out.println("Enter the capital of Argentina: ");
		String country2 = scan.nextLine();
		System.out.println("You entered: " + country2);
		
		
		
		
	
		scan.close();
		
		
		
		
		
		
	}

}
