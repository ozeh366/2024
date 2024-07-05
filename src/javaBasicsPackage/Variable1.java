package javaBasicsPackage;

public class Variable1 {

	public static void main(String[] args) {
		int a =5; // local variable
		System.out.println(a); //5
		
		a = 6; // Variable overiding
		System.out.println(a); // 6
		
		a = 67; // Variable overiding
		System.out.println(a); // 6
		
		char b = 'a';
		System.out.println(b); // a
		
		boolean d = false;
		System.out.println(d); //true
		d = true;
		System.out.println(d); //true
		
		System.out.println(3 > 2); //true
		System.out.println(2 > 3); //false
		
		int e = 200;
		int f = 100;
		boolean h = e > f; //true
		System.out.println(h);//true
		System.out.println(!h);//false because of the "!" mark

	}

}
