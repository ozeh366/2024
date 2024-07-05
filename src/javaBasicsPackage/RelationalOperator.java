package javaBasicsPackage;

public class RelationalOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 11;
		
		if (a > b) {
			System.out.println("A is greater than b");
		}else {
			System.out.println("Wrong expression");
		}
		
		if (++a == b) {
			System.out.println("A is equal to b");
		}else {
			System.out.println("Wrong expression");
		}
		
		if (a > --b) {
			System.out.println("A is greater than b");
		}else {
			System.out.println("Wrong expression");
		}
		
		if (b < a) {
			System.out.println("B is less than a");
		}else {
			System.out.println("Wrong expression");
		}
		
		if (b != a) {
			System.out.println("B is not equal to a");
		}else {
			System.out.println("Wrong expression");
		}
		
		String h = "hello";
		String H = "HELL0";
		
		if (h == H) {
			System.out.println("This is not how to compare strings");
		} else if (h.equalsIgnoreCase(H)) {
			System.out.println("this is the right way to compare string");
		}else {
			System.out.println("End");
		}
	}

}
