package unit005_WritingClasses;

import java.util.Scanner;

public class U5_L2_parameters
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		compute(scan);
		total(3, 4);//Arguments | actual values | actual parameters
		square(45);
		squareScanner(scan);
		scan.close();
		
	}//End of main
	
	public static void compute(Scanner scan)
	{
		System.out.println("Enter first number \u2192");
		double firstNum = scan.nextDouble();
		System.out.println("Enter second number \u2192");
		double secondNum = scan.nextDouble();
		System.out.println("What kind of operation do you want: [+, -, x, /]");
		scan.nextLine();
		String symbol = scan.nextLine();
		System.out.println("symbol: " + symbol);
		double total = 0;
		
		switch(symbol)
		{
		case "+":
			total = firstNum + secondNum;
			break;
		case "-":
			total = firstNum - secondNum;
			break;
		case "x":
			total = firstNum * secondNum;
			break;
		case "/":
			total = firstNum / secondNum;
			break;
		default:
			System.out.println("You entered an incorrect symbol.");
			break;
		}
		
		System.out.println("The total is \u2192 " + total);
		
		
		
		
		
		
	}

	public static void squareScanner(Scanner scan)
	{
		System.out.println("Enter a double value: ");
		double doubleValue = scan.nextDouble();
		System.out.println("You input the value: " + doubleValue);
	}

	public static void square(int i)
	{
		System.out.printf("The value " + i +" squared: " + Math.pow(i, 2) + "\n\n");
	}

	public static void total(int a, int b)//parameters
	{
		System.out.println("The sum is " + (a + b));
	}
	
	

}
