package unit005_WritingClasses;

import java.util.Scanner;


public class U5_L1_VoidMethods
{
	/*
	 * 1 - accessibility: public | private | protected 2 - static = Don't need to
	 * instantiate an instance | object instead --> You call the class that houses
	 * the method. 3 - return type --> void | int | any reference type 4 - name of
	 * the method 5 - In parenthesis --> You will include your parameters (orderly)
	 */
	public static void main(String[] args)
	{
		doStuff();
		addingNumbers();
		doStuff();
		/*
		 * The protected methods only work inside the
		 * U5_L1_ProtectedMethods folder
		 */
//		U5_L1_ProtectedMethods.firstProtectedMethod();
//		U5_L1_ProtectedMethods.secondProtectedMethod();
		/*
		 * The private method only works inside the 
		 * U5_L1_PrivateMethods class
		 */
//		U5_L1_PrivateMethods.privateMethod1();
		
	}// End of main

	public static void doStuff()
	{
		System.out.println("I am a line inside doStuff");
	}// End of doStuff
	
	public static void addingNumbers()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second integer: ");
		int num2 = scan.nextInt();
		System.out.println("The total is: " + (num1 + num2));
		scan.close();
	}

}
