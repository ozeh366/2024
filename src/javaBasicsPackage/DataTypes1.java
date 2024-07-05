package javaBasicsPackage;

public class DataTypes1 {
	
	/* In Java, data types specify the type of data that can be stored in a variable. 
	 * Java has two categories of data types: primitive data types and reference data types.

	Primitive Data Types:
		Numeric Data Types:
		Integer Types: byte, short, int, long
		Floating-Point Types: float, double
		Character Type: char
		Boolean Type: boolean
		
	Reference Data Types:
		Class Types: Any class you create
		Array Types: Arrays of any data type
		Interface Types: Interfaces you define
		Enum Types: Enumeration types
		
	Let's delve into each type:

	Integer Types:
		byte: 8-bit signed integer (-128 to 127)
		short: 16-bit signed integer (-32,768 to 32,767)
		int: 32-bit signed integer (-2^31 to 2^31 - 1)
		long: 64-bit signed integer (-2^63 to 2^63 - 1)
		
	Floating-Point Types:
		float: 32-bit floating-point number (IEEE 754 single-precision)
		double: 64-bit floating-point number (IEEE 754 double-precision)
		
	Character Type:
		char: 16-bit Unicode character (0 to 65,535)
		
	Boolean Type:
		boolean: Represents true or false values (size not precisely defined)
		
	Primitive data types have fixed sizes and hold their values directly. 
	They are stored in the stack memory, making them faster to access.

	Reference data types refer to objects, and they are stored in the heap memory. 
	These types don't hold the actual data but a reference to where the data is stored.

	When to Use Which:

	Use int for general integer values, unless memory optimization is necessary, then consider byte, short, or long.
	Use double for floating-point calculations, as it provides more precision compared to float.
	Use char for single characters.
	Use boolean for logical values (true/false). */
	
	double c = 100.5; // Global Variable
	
	static int d = 19; // static variable
	
	// Main method are predefined methods in java.
	
	public static void main(String[] args) { //Predefined method in java
		int x; //(Declare a variable)
		x = 9;
		
		int a = 5; // Define a variable
		
		int b = 6; // Local Variable
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		//System.out.println(d + c); Can't call non static variables in a static function/method
	}
}
