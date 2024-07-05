package javaBasicsPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 0;
		
		// Logical Operator : if the first condition is wrong, the second condition will not be checked
		System.out.println(a > b && a < c); // T, F = F
		
		//Bitwise Operator : if the second condition is wrong, the second condition will be checked
		System.out.println(a < b & a < c & b > c); // F, F, T = F
		
		//Verify the logic is checked by both 
		
		System.out.println(a < b && ++a < c ); //F
		System.out.println(a);//10
		
		//Bitwise Operator
		System.out.println(a > b & ++a < c ); // F
		System.out.println(a);//11
		
		//Logical operator
		System.out.println(a > b && c > a);//F
		
		//Bitwise
		System.out.println(a < b & ++a > c);// F 
		System.out.println(a);
	}

}
