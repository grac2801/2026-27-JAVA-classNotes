package unit005_WritingClasses.safer;

public class DogClient 
{

	public static void main(String[] args)
	{
		Dog sparky = new Dog("Terrier", 70, "Sparky");
		System.out.println(sparky);
		Dog wilson = new Dog("Chihuahua", 15, "Wilson");
		System.out.println(wilson);
		System.out.println(wilson.equals(sparky));
	}

}
