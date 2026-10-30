package unit005_WritingClasses.Constructors;


public class Dog
{
	private String breed;
	private int weight;
	private String name;
	private String color;

	public Dog(String breed, int weight, String name, String color)
	{
		this.breed = breed;
		this.weight = weight;
		this.name = name;
		this.color = color;
	}

	public Dog(String breed, String name)
	{
		this.breed = breed;
		this.name = name;
		this.weight = 0;
		this.color = "unknown";
	}

	public Dog(String breed, String color, String name, int weight)
	{
		setBreed(breed);
		setColor(color);
		setName(name);
		setWeight(weight);
	}

	public Dog()
	{
		this("unknown", "brown", "Laica", 70);
	}

	public String getBreed()
	{
		return breed;
	}

	public int getWeight()
	{
		return weight;
	}

	public String getName()
	{
		return name;
	}

	public String getColor()
	{
		return color;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	@Override
	public String toString()
	{
		String message = "Dog breed: " + this.getBreed() + "\n" + "Weight: " + this.getWeight() + "\n" + "Name of dog: "
				+ this.getName() + "\n" + "Dog color: " + this.getColor() + "\n\n";
		return message;
	}

	public boolean equals(Dog other)
	{
		if (this.breed.equals(other.getBreed()) && this.weight == other.getWeight()
				&& this.name.equals(other.getName()))
		{
			return true;
		}
		return false;
	}
	
	
	public void printObject()
	{
		System.out.println(this);
	}
	
	
	
	
	
	
	

}
