package unit004_iteration;

public class U4_L4_traversingStrings
{

	public static void main(String[] args)
	{
		/*
		 * invert a string (loop to pool)
		 */
		System.out.println("loop to pool (from index 4)");
		String str = "loop";
		String newStr = "";
		
		for (int i = str.length(); i > 0; i--)
		{
			newStr += str.substring(i - 1, i);
		}
		
		System.out.println("str: " + str);
		System.out.println("newStr: " + newStr);
		
		
		
		/*
		 * Second way to invert a string
		 */
		String str1 = "loop";
		String newStr1 = "";
		
		for(int i = str1.length() - 1; i >= 0; i--)
		{
			newStr1 += str1.substring(i, i + 1);
		}
		System.out.println("str1: " + str1);
		System.out.println("newStr1: " + newStr1);
		
		
		/*
		 * Removing substrings from a string
		 */
		String orig = "Mississippi";
		String newOrig = "";
		
		for(int i = 0; i < orig.length(); i++)
		{
			if(!(orig.substring(i, i + 1).equals("i")))
			newOrig += orig.substring(i, i + 1);
		}
		System.out.printf("%s%n%n", orig);
		System.out.printf("%s%n", newOrig);
		
		/*
		 * Code for a loop which iterates through the word "tentative" and
		 * prints every other letter, and leave a space in between every letter
		 */
		
		
		
	}//End of main

} //End of class
