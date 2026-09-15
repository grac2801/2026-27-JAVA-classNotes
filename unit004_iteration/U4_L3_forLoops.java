package unit004_iteration;

public class U4_L3_forLoops
{

	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println((i + 1) + ": Hello");
		}
		
		
		/*
		 * Write a loop that will output only the even numbers
		 * from 1 - 100 inclusive
		 */
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		
		/*
		 * second solution
		 */
		System.out.println();
		for(int i = 2; i <= 100; i+=2)
		{
			System.out.print(i + " ");
		}
		
		
		/*
		 * Calendar view
		 */
		System.out.println();
		int counter = 1;
		for (int i = 2; i <= 100; i+=2)
		{
			if(counter <= 5)
			{
				System.out.printf("%-4d", i);
				counter++;
			}
			
			if(counter > 5)
			{
				System.out.println();
				counter = 1;
			}
		}
		
		
		/*
		 * calendar view 2nd optional coding values
		 */
		System.out.println("\n\nSecond view");
		for (int i = 2; i <= 100; i+=2)
		{
			if(i % 10 == 0)
			{
				System.out.printf("%-4d", i);
				System.out.println();
			}
			else
			{
				System.out.printf("%-4d", i);
			}
		}
		
		
		/*
		 * strings and loops
		 */
		String word1 = "house";
		int word1Length = word1.length();
		for(int i = 0; i < word1Length; i++)
		{
			System.out.println(word1.substring(i, i + 1));
		}
		
		
		/*
		 * scope
		 */
		int i = 1;
		for (; i <= 5; i++)
		{
			System.out.println(i + "\u2192 Hello");
		}
		
		System.out.println("The last value used in the for loop for i was " + (i - 1));
		
		
		/*
		 * NEVER, NEVER DO
		 */
//		for(;;)
//		{
//			System.out.println("Forever");
//		}
		
		
		
		
		
		
		
		
		
		
	}//end of main

}//End of class
