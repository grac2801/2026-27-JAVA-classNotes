package unit006_Arrays;

import java.util.Arrays;
import edhesive.shapes.*;

public class U6_L1_OneDimensionalArray
{
	public static void main(String[] args)
	{
		// They always start with index value 0
		int[] numbers = { 10, 15, -5, 4, 1};
		System.out.println(Arrays.toString(numbers));
		
		//They can be treated as regular numbers
		numbers[0] = 89;
		numbers[1]++;
		numbers[2] += 4;
		System.out.println(Arrays.toString(numbers));
		
		double[] doubleArray = new double[3];
		doubleArray[0] = 10.6;
		doubleArray[1] = 20.5;
		doubleArray[2] = 30.9;
		System.out.println("doubleArray: " + doubleArray[2]);
		
		//Adding first 2 values of my array
		double answer = doubleArray[0] + doubleArray[1];
		System.out.println("Total value = " + answer);
		
		
		//objects can be added to an array
		Circle[] myCircles = new Circle[2];
		myCircles[0] = new Circle(5.8);
		myCircles[1] = new Circle();
		
		System.out.println(myCircles[0]);
		System.out.println(myCircles[1]);
		
		
		//An array of characters
		char[] myChars = new char[2];
		myChars[0] = 'a';
		System.out.println(myChars[0]);
		System.out.println(myChars[1]);
		
		
		char[] word = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(word);
		
		
		String[] words = {"dog", "cat", "bird"};
		System.out.println(words);
		System.out.println(Arrays.toString(words));
		
		
		
		
		
		
		
		
		
	}

}
