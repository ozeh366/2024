package javaBasicsPackage;

import java.util.Scanner;

public class Variable5 {
	
	int b = 10; //global variable
	int d;
	String ozeh;
	static int c;// static variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c =6;
		System.out.println(c);
		
		// create an object
		Variable5 v5 = new Variable5(); // memory got allocated for global variable
		System.out.println(v5.b); // 10
		System.out.println(v5.d + v5.ozeh); // if you don't define the variable int will be 0 and String will be null
		
		v5.a(); //1 calling a non static method
		
		c = 45; //initialize static variable
		System.out.println(c);
		
	
		
	}
	
	public void a() {
		int i = 1;
		b = 200;
		System.out.println(i + b); // 201
	}
}
