package oopConcept;

public class Typecasting {

	
	
	public static void main(String[] args) {
		
		
		// Widening/Implicit Casting - Convert small datatype to large datatype
		int a = 10;
		double b = a;
		System.out.println(b); // 10.0
		
		int num = 100;
	    long longNum = num; // int to long
	    System.out.println(num);
	    float floatNum = longNum; // long to float
	    System.out.println(floatNum);

	    
	    //Narrowing/Explicit Casting - convert a larger data type to a smaller one
	    double d = 334.9;
	    int small = (int) d;
	    System.out.println(small); // 335

	    
 		//String to Integer conversion
		String s ="10";
		int x = Integer.parseInt(s);
		System.out.println(s);
		
		//Integer to String conversion
		int y = 20;
		String j = String.valueOf(y);
		System.out.println(j);
		
		double g = 34.9;
		String cast = Double.toString(g);
		System.out.println(cast);
		
		String hh = "come";
		double k = Double.parseDouble(hh);
		System.out.println(k);
		
		
	}

}
