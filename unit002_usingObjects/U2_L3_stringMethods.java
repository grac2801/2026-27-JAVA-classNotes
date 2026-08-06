package unit002_usingObjects;

public class U2_L3_stringMethods
{

	public static void main(String[] args)
	{
		System.out.println("********************");
		System.out.println("Length of a String");
		System.out.println("********************");
		String word = new String("apple");
		System.out.println("apple has a length of " + word.length());
		
		
		System.out.println("********************");
		System.out.println("Equality of strings");
		System.out.println("********************");
		String name1 = "John";
		String name2 = "John";
//		String name2 = new String("John");
		System.out.println("name1 equal to name2? (==) " + (name1 == name2));
		System.out.println("name1 equal to name2? (.equals) " + (name1.equals(name2)));
		
		
		System.out.println("********************");
		System.out.println("substring(start, stop) --overloading");
		System.out.println("********************");
		String wildAnimal = "Rhinocerous";
		System.out.println("substring 1 - 4 = " + wildAnimal.substring(1, 4));
		System.out.println("substring 4 on = " + wildAnimal.substring(4));
		
		System.out.println("********************");
		System.out.println("uppercasing a string");
		System.out.println("********************");
		String upper = new String("scream");
		String lower = new String("WHISPER");
		System.out.println(upper);
		System.out.println(lower);
		System.out.println("scream should say: " + upper.toUpperCase());
		System.out.println("WHISPER should say: " + lower.toLowerCase());
		
		
		System.out.println("********************");
		System.out.println("compareTo");
		System.out.println("********************");
		String herbivore = new String("antelope");
		String pet = new String("dog");
		System.out.println("compare antilope to dog: " + herbivore.compareTo(pet));
		System.out.println("compare dog to antelope: " + pet.compareTo(herbivore));
		
		
		System.out.println("********************");
		System.out.println("indexOf");
		System.out.println("********************");
		String striped = new String("Zebra");
		System.out.println("index of ba in zebra is " + striped.indexOf("ba"));
		System.out.println("index of x in zebra is " + striped.indexOf("x"));
		
		
		
		
		
		
		
		
	}

}
