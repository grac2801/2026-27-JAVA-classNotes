package unit005_WritingClasses.safer;

public class Dog
{
	// instance variables or attributes or fields
	private String breed;
	private int weight;
	private String name;

	// Constructor
	public Dog(String breed, int weight, String name)
	{
		this.breed = breed;
		if (weight <= 0)
		{
			this.weight = Math.abs(weight);
		}
		else
		{
			this.weight = weight;
		}
		this.name = name;
	}// End of constructor

	// Getters and setters
	// Accessors and mutators
	public String getBreed()
	{
		return this.breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public int getWeight()
	{
		return this.weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		String message = "Dog breed: " + this.getBreed() + "\n" +
						"Weight: " + this.getWeight() + "\n"  +
						"Name of dog: " + this.getName() + "\n\n";
		return message;
	}
	
	public boolean equals(Dog other)
	{
		if(this.breed.equals(other.getBreed()) && this.weight == other.getWeight()
				&& this.name.equals(other.getName()))
		{
			return true;
		}
		return false;
	}

}
