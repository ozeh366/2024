package javaBasicsPackage;

public class Variable2 {
	

	public static void main(String[] args) {
		String s = "Hello Selenium"; 
		
		// calculate the length of string parameter
		
		int lengthofString = s.length();
		System.out.println(lengthofString);
		
		
		//Array
		
		int a[] = {1, 2, 3, 4, 5}; // Integer array
		
		String  b[] = {"I", "am", "a", "star"}; // String Array
		
		System.out.println(a[0]); // 1
		System.out.println(b[1]); // am
		System.out.println(a.length); // get the length of the array
		
		//Object can hold all types of primitive data types inside the array
		
		Object c[] = {1, 2, 3, "Bentley", "is", 'a', "dog", "34.4"};
		
		System.out.println(c[3]); //Bentley
		System.out.println(c[5]); //a
		
		myVariable(); // Execute the logic
		
	}
		
		// User defined Method
		public static void myVariable() {
			int a = 5;
			System.out.println(a + " inside UDM");
		}


}
