package unit001_primitives;

public class U1_L6_casting
{

	public static void main(String[] args)
	{
//		int a = 6;
//		System.out.println(a);
//		double b = 6;
//		System.out.println(b);
//		int c = 6.5;
//		System.out.println(c);
		
		/*
		 * widening = smaller to larger data type
		 * narrowing = larger to smaller data type
		 * casting = convert one data type to
		 * another but you lose some data.
		 */
		
		int e = (int)3.787;
		System.out.println(e);
		
		//divide
		int f1 = 13;
		double half = f1 / 2;
		System.out.println(half);
		
		double f2 = 13;
		half = f2 / 2;
		System.out.println(half);
		
		
		
		int f3 = 13;
		half = (double) f3 / 2;
		System.out.println(half);
		
		
		
		int f4 = 13;
		half = (double) (f4 / 2);
		System.out.println(half);
		
		//narrowing (lossy conversion)
		double h1 = 13;
		int roundedHalf = (int) (h1 / 2.0);
		System.out.println(roundedHalf);
		
		/*
		 * rounding to the nearest value instead of
		 * truncating.
		 * positives -> add 0.5
		 * negatives -> subtract 0.5
		 */
		
		final double pointFive = 0.5;
		double pos1 = 9.468;
		double pos2 = 9.8976;
		double pos3 = -5.9898;
		double pos4 = -5.3432;
		System.out.println((int)(pos1 + pointFive));
		System.out.println((int)(pos2 + pointFive));
		System.out.println((int)(pos3 - pointFive));
		System.out.println((int)(pos4 - pointFive));
		
		
		
		
		
		
		

	}
}
