package unit002_usingObjects;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class U2_L8_mathFunctions
{

	public static void main(String[] args)
	{
		System.out.println(Math.abs(-5));
		System.out.println((int)(Math.pow(2, 3)));
		System.out.println(Math.sqrt(8.8));
		//print the answer with only 3 numbers after the decimal point.
		System.out.printf("%.3f%n", Math.sqrt(8.8));
		
		System.out.println("********************");
		System.out.println("Randomizers");
		System.out.println("********************");
		System.out.println(Math.random());
		//Print a number between 1 and 100 inclusive
		int oneTo100 = (int)(Math.random() * 100) + 1;
		System.out.println(oneTo100);
		
		
		//print numbers between 10 and 15
		int randNum = (int)(Math.random() * 6) + 10;
		System.out.println(randNum);
		
		/*
		 * 1- print numbers between 10 and 34
		 * 2- print numbers between -10 and +10
		 */
		int rn = (int) (Math.random() * 25) + 10;
		System.out.println("rn = " + rn);

		int neg = (int) (Math.random() * 21) - 10;
		System.out.println("neg = " + neg);
		
		
		
		System.out.println("********************");
		System.out.println("Random class");
		System.out.println("********************");
		Random rand = new Random();
		int newNumber = rand.nextInt(10) + 1;
		System.out.println(newNumber);
		
		
		System.out.println("********************");
		System.out.println("ThreadLocalRandom");
		System.out.println("********************");
		int day = ThreadLocalRandom.current().nextInt(31) + 1;
		System.out.println("The selected day is: " + day);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
