package unit005_WritingClasses.Constructors;

public class Dog_Client
{

	public static void main(String[] args)
	{
		Dog d = new Dog("Poodle", "Chocolate", "Skippy", 120);
		System.out.println(d);
		
		Dog pup2 = new Dog("Yorkie", "Charles");
		System.out.println(pup2);
		
		Dog pup3 = new Dog();
		System.out.println(pup3);
		
		Dog pup4 = new Dog("Bulldog", 50, "Brutus", "white");
		System.out.println(pup4);
		
		pup2.printObject();
	}

}
