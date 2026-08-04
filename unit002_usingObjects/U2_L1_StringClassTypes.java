package unit002_usingObjects;

public class U2_L1_StringClassTypes
{
	public static void main(String[] args)
	{
		/*
		 * primitive data types
		 */
		System.out.println("********************");
		System.out.println("Store by value");
		System.out.println("********************");
		int num1 = 5;
		System.out.println("num1 = " + num1);
		int num2 = num1;
		System.out.println("num2 = " + num2);
		
		//change num1 to 10
		num1 = 10;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("********************");
		System.out.println("Data value by reference");
		System.out.println("********************");
		String city1 = "San Diego";
		String city2 = city1;
		
		System.out.println("city1 memory loc: " + city1.hashCode());
		System.out.println("city2 memory loc: " + city2.hashCode());
		
		//Make a change to city1
		city1 = "Los Angeles";
		System.out.println("city1 memory loc: " + city1.hashCode());
		System.out.println("city2 memory loc: " + city2.hashCode());
		
		/*
		 * Strings not instantiated (objects not initiated) are given
		 * a "null" value.
		 */
		String color = null;
		System.out.println(color);
		
		/*
		 * Creating, declaring and initializing strings
		 */
		String alpha = "Toy Story";
		String beta = alpha;
		alpha += " 2";
		System.out.println("alpha = " + alpha);
		System.out.println("beta = " + beta);
		
		
		String female_hero = "Wonder Woman";
		String hero;
		hero = "Spiderman";
		String another_hero = new String("Superman");
		System.out.println("female hero: " + female_hero);
		System.out.println("hero: " + hero);
		System.out.println("another_hero: " + another_hero);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
