package javaBasicsPackage;

public class Loops {

	public static void main(String[] args) {
	
		
		/* For Loop - if the number of iteration is known use for-loop
		 * Print numbers from 0 to 5
		 */
		
		for (int i = 5; i < 6; i++) {
			System.out.println(i);
		}
		System.out.println("exit loop");
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		} 
		System.out.println("exit loopp");
		
		
		/* For Each Loop - it used to traverse/access the elements of an array in Java
		 *  Print an array using a for each loop
		 *  Traverse the array using for each loop
		 */
		
		
		int a[] = {1, 2, 4};
		System.out.println(a[0]);
		
		for (int x : a) {
			System.out.println("Print content in variable a " + x);
		}
		
		Object b[] = {"james", "john", 23};
		System.out.println(b.length); // find the length of the array
		
		for (Object c : b) {
			System.out.println("content of the array " + c);
		}
		
		/*
		 * While Loop: While condition is not met print the value 
		 */
		
		int g = 1;
		
		while (g < 10) {
			System.out.println("While loop value " + g);
			g++;
		}
		
		int b1 = 5;
		
		while (b1 > 2) {
			System.out.println("decrement " + b1);
			b1--;
			
			
		/*
		 * DO WHILE - 
		 */
		
		int e = 2;
		
		do {
			System.out.println(e);
			e++;
			
		} while (e < 4); {
		
		}
		
		/*
		 * Break Statement
		 */
		
		for (int w = 0; w < 10; w++) {
			System.out.println(w);
			
			if (w == 5) {
				break;
			}
		}
		System.out.println("exitt loop");
		
		
		for (int z1 = 10; z1 > 6; z1--) {
			System.out.println(z1);
			
			if (z1 == 8) {
				break;
			}
		}
			
		}
		
		int z2 = 4;
		
		while (z2 < 8) {
			System.out.println(z2);
			z2++;
			
			if (z2 == 6) {
				break;
			}
		}
		
		
		
	}
	
}
