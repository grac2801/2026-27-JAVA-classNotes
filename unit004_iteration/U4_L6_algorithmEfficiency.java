package unit004_iteration;


public class U4_L6_algorithmEfficiency
{

	public static void main(String[] args)
	{
		/*
		 * Algorithm 1 --> total --> 100 iterations on this algorithm
		 */
		String word = "dictionary";
		int count =  0;
		
		for (int i = 0; i < word.length(); i++)
		{
			for (int j = 0; j < word.length(); j++)
			{
				count++;
				if(i != j && word.substring(i, i + 1).equals(word.substring(j, j + 1)))
				{
					System.out.println(word.subSequence(i, i + 1) + " is a duplicate");
				}
			}// end of inner for loop

		}//end of outer for loop
		
		System.out.println("There were " + count + " iterations");

		System.out.println("_______________________________________________");
		/*
		 * Second algorithm --> ___ iterations
		 */
		int totalCount = 0;
		
		for (int i = 0; i < word.length(); i++)
		{
			for (int j = i + 1; j < word.length(); j++)
			{
				totalCount++;
				if(word.substring(i, i + 1).equals(word.substring(j, j + 1)))
				{
					System.out.println(word.subSequence(i, i + 1) + " is a found duplicate");
				}
			}//End of inner for loop

		} //End of outer for loop
		
		System.out.println("There were " + totalCount + " iterations.");

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
