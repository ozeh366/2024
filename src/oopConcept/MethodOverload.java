package oopConcept;

public class MethodOverload {
	
	public int sum(int a, int b) {
		System.out.println("sum1 " + a + b);
		return 0;
	}
	
	public static double sum(double a, double b, double c) {
		System.out.println("sum2 " + a + b + c);
		return 0;
	}
	
	public static int sum(int a, int b, int c) {
		System.out.println("sum3 = " + a + b + c );
		return 0;
	}
	

}
