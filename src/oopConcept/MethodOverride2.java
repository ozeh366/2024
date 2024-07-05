package oopConcept;

public class MethodOverride2 extends MethodOveride{

	
	public String name(String name) {
		System.out.println("My name in Method Overide 1 Class is " + name);
		return name;
	}
	
	public static void main(String[] args) {
		MethodOverride2 m2 = new  MethodOverride2();
		m2.name("Paul");
		MethodOveride m1 = new MethodOveride();
		m1.name("teacher");
	}
}
