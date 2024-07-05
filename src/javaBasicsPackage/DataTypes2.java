package javaBasicsPackage;

public class DataTypes2 {
	
	int c = 3; //Global variable
	
	static int z = 100; // static variable
	
	// Main method : Predefined method inside the class
	public static void main(String[] args) {
		
		String t = "Lucio"; //local variable
	//	System.out.print(z + " It'll print on same line without ln");
		System.out.println(z + " Ln stands for next line");
		aMethod();
		bMethod();
		System.out.println("Main Method end");
		
	//	static int y = 4; We can't define a static variable in a static function
	//	System.out.println(c); We Can't call non static variables in a static function/method
	}
	
	// user defined static method
	public static void aMethod() {
	System.out.println("UDM 1");
	}
	
	// user defined static method
	public static void bMethod() {
	System.out.println("UDM 2");
	}
}

