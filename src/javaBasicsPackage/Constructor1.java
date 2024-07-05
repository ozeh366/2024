package javaBasicsPackage;

public class Constructor1 {
	
	// a constructor is similar to method that is called when an object of the class is called
	//Class name and const. name must be the same
	// it can be created once and called multiple times
	
	
	/*Static Variables
	 * you can call static variables in static methods
	 * you can also call static variables in non static functions
	 * 
	 * Static Functions
	 * You can call static functions directly into the main method 
	 * 
	 * Non-Static Variables
	 * you can call non-static variables in static methods 
	 * you can also call non-static variables in non static functions
	 * 
	 * Non-Static Functions
	 * You can call non-static functions directly into the main method 
	 */
	
	int roll;
	String name;
	static String college = "Murray";
	
	Constructor1(int r, String n) {
		roll = r;
		name = n;
	}

	public void getResult() {
		System.out.println(roll + " " + name + " " + college); 
	}
	
	public static void getStaticResult() {
		System.out.println(college); 
	}
	
	public static void main(String[] args) {
		getStaticResult();
	}
	
}
