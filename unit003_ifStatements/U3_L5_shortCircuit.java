package unit3_Boolean_ifStatements;

public class U3_L5_shortCircuit
{

	public static void main(String[] args)
	{
//		String name = "Joe";
//		String mood = "happy";
//		
//		/*
//		 * first expression is false, therefore second will not happen
//		 */
//		if(name.equalsIgnoreCase("Helen") && mood.equalsIgnoreCase("happy"))
//		{
//			System.out.println("They are both true");
//		}
//		else
//		{
//			System.out.println("One of them is not true.");
//		}
		
		int x = 3;
		int y = 6;
		if(x < 5 && y != 3)
		{
			System.out.println("x < 5, y not 3");
		}
		
		
		if(x >= 0
			    ||
			    y == 100)
		{
			System.out.println("one of them is true");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
