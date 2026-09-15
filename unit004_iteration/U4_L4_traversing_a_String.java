package unit004_iteration;

public class U4_L4_traversing_a_String {
    public static void main(String[] args) {
        /* loop to pool (from index 4) */
		System.out.println("loop to pool (from index 4)");
		String str = "loop";
		String newStr = "";

		for (int i = str.length(); i > 0; i--)
		{
			newStr += str.substring(i - 1, i);
		}
		System.out.println("str: " + str);
		System.out.println("newStr: " + newStr);

		
		
		/* index = 3 */
		System.out.println("\n\nloop to pool (from index 3)");
		String str1 = "loop";
		String newStr1 = "";
		for (int i = str1.length() - 1; i >= 0; i--)
		{
			newStr1 += str1.substring(i, i + 1);
		}
		System.out.println("str1: " + str1);
		System.out.println("newStr1: " + newStr1);

		
		
		System.out.println("What does this do? ");
		System.out.println("\n\nLooping from the middle of the string");
		/* Looping from the middle of the string */
		String state = "Memo";
		String fromMiddle = "";
		for (int i = 0; i < state.length(); i++)
		{
			int index = (i + state.length() / 2) % state.length();
			System.out.println(state.substring(index, index + 1));
			fromMiddle += state.substring(index, index + 1);
		}
		System.out.printf("%s%n", fromMiddle);
		
		
		
		
		
		System.out.println("\n\nRemoving substrings in a loop");
		/* Removing substrings in a loop */
		String orig = "Mississippi";
		String newOrig = "";

		for (int i = 0; i < orig.length(); i++)
		{
			if (!(orig.substring(i, i + 1).equals("i")))
			{
				newOrig += orig.substring(i, i + 1);
			}
		}
		System.out.printf("%s%n%n", orig);
		System.out.printf("%s", newOrig);
		
		
		
		
		
		
		System.out.println("\n\nTry a loop which prints every other letter");
		/* Try a loop which prints every other letter */
		String another = "tentative";
		String everyOther = "";
		for (int i = 0; i < another.length(); i+=2)
		{
			System.out.print(another.substring(i, i + 1) + " ");
		}
		System.out.printf("%s%n", everyOther);
		
		/* Try a loop which prints every other letter 2nd way*/
		String another1 = "tentative";
		String everyOther1 = "";
		for (int i = 0; i < another1.length(); i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(another1.substring(i, i + 1) + " ");
			}
			
		}
		System.out.printf("%s%n", everyOther1);
    }
}
