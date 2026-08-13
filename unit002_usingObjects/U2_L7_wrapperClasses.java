package unit002_usingObjects;

public class U2_L7_wrapperClasses
{

	public static void main(String[] args)
	{
		//Integer five = new Integer(5); Deprecated
		Integer thirtySixInt = Integer.valueOf(36);
		Integer thirtySixString = Integer.valueOf("36");
		Integer binary11 = Integer.valueOf("10111010", 2);
		System.out.println("thirtySixInt: " + thirtySixInt);
		System.out.println("thirtySixString: " + thirtySixString);
		System.out.println("binary11: " + binary11);
		
		
		int total = thirtySixInt + thirtySixString;
		System.out.println("total: " + total);
		int anotherTotal = Integer.sum(thirtySixInt, thirtySixString);
		System.out.println("anotherTotal: " + anotherTotal);
		
		System.out.println("The greatest value is: " +Integer.max(total, anotherTotal));
		
		
		System.out.println("********************");
		System.out.println("parsing");
		System.out.println("********************");
		String num1 = "700";
		String num2 = "250";
		//convert string to integer
		int first = Integer.valueOf(num1);
		int second = Integer.valueOf(num2);
		
		int first1 = Integer.parseInt(num1);
		int second2 = Integer.parseInt(num2);
		
		System.out.println("The total for num1 and num2 is: " + (first + second));
		System.out.println("The total for num1 and num2 is: " + (first1 + second2));
		
		double marioScore = Double.valueOf(52.62);
		double marioScoreString = Double.valueOf("45.12");
		System.out.println(marioScore);
		System.out.println(marioScoreString);
		
		
		
		
		
	}

}
