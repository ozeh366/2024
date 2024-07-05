package oopConcept;


public class Inheritance3 extends Inheritance2{

	public static void main(String[] args) {
		z = 300;
		
		Inheritance1 i1 = new Inheritance1();
		int b = i1.y;
		System.out.println(b);
		i1.y = 300;
	
		Inheritance2 i2 = new Inheritance2();
		i2.calcDivision(10, 2);

	}

}
