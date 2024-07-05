package javaBasicsPackage;

public class Constructor2 {

	public static void main(String[] args) {
		Constructor1 s1 = new Constructor1(89, "Paul");
		//Constructor1.college = " new";
		s1.getResult();
		Constructor1.getStaticResult();
		System.out.println(Constructor1.college);
	}
}
