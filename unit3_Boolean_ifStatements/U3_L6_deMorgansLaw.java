package unit3_Boolean_ifStatements;

public class U3_L6_deMorgansLaw
{

	public static void main(String[] args)
	{
		/*
		 * !(a && b) equal to !a || !b 
		 */
		int x = 6;
		int y = 10;
		
		boolean first = !(x == 5 && y < 15);
		System.out.println("first: " + first);
		boolean first_alt = x != 5 || y >= 15;
		System.out.println("first_alt: " + first_alt);
		
		//Another example
		boolean second = !(x <= 10 || y != 10);
		System.out.println("second: " + second);
		boolean second_alt = (x > 10 && y == 10);
		System.out.println("second_alt: " + second_alt);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
