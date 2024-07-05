package javaBasicsPackage;

public class Notes {

	public static void main(String[] args) {
		
		//Data Types
		int a = 10;
		int b = 2;
		
		System.out.println(Math.pow(a, b)); // Find power
		
		/*
		 * "Cast" is the process of transforming one data type to another
		 * 
		 * WE can't do casts like int to String
		 * 
		 * Syntax for casting is to wrap the data type in parentheses ex. (float) 52
		 * Casting is nothing more than a guarantee to the compiler
		 * 
		 * Narrow Casting:
		 * - double -> int
		 * - We run the risk of losing information in exchange for freeing up memory
		 * - I cannot put all of a bathtub into a water bottle without losing info
		 * 
		 * Wide Casting
		 * - int -> double
		 * - I can put all of the contents of a water bottle into a bathtub,
		 *   without losing any info
		 */
		
		// Double casting: int -> float -> double
		// 52 -> 52.0f -> 52.0
		double doubleCast = 52; // Don't double cast
		System.out.println("Before the cast " + doubleCast);
		
		doubleCast = (float) 52;
		System.out.println("After the cast " + doubleCast);
		
		// Single casting is fine
		int myCastedNum = (int) 52.0f;
		System.out.println(myCastedNum);
		
		int pi = (int) Math.PI; // 3.14 -> 3. Lose information
		
		float gpm = 21.989f;
		System.out.println("Value of PI as a double: " +  Math.PI);
		System.out.print("Value of PI as a float: " + (float) Math.PI);
		System.out.println();
		
		double floatingNum = 4.999999999999999;
		System.out.println("Number as double: " + floatingNum);
		System.out.println("Number as float: " + (float) floatingNum);
		System.out.println("Number as int: " + (int) floatingNum);

	}

}
