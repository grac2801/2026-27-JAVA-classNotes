package unit004_iteration;

public class U4_L5_NestedForLoops
{

	public static void main(String[] args)
	{
		String str = "Hi";
//		for (int i = 0; i < str.length(); i++)
//		{
//			for (int j = 0; j < 3; j++)
//			{
//				System.out.print(str.substring(i, i + 1));
//			}
//			System.out.println();
//		}
		
//		for(int a = 4; a > 0; a--)
//		{
//			for(int b = a; b < 5; b++)
//			{
//				System.out.printf("%d", b);
//			}
//			System.out.println();
//		}
		
		
		/*
		 * Challenge: print the word hello backwards
		 */
//		str = "Hello";
//		String backwards = "";
//		
//		for(int i = 0; i < 1; i++)
//		{
//			for(int j = str.length() - 1; j >= 0; j--)
//			{
//				backwards += str.substring(j, j + 1);
//			}
//			System.out.printf("%s%n", backwards);
//		}
		
		
		for(int i = 1; i < 4; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}//End of main

}//End of class
