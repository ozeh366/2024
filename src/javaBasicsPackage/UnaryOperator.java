package javaBasicsPackage;

public class UnaryOperator {

	public static void main(String[] args) {
		
		// Post Increment epr++
		int a = 1;
		System.out.println(a); // 1
		System.out.println(a++); // 1 but incremented in RAM
		System.out.println(a);//2
		
		//Pre-increment ++epr
		int b = 0;
		System.out.println(b); // 0
		System.out.println(++b); // 1 incremented immediately 
		System.out.println(b);//1
		
		int c =10;
		int d = 10;
	
		System.out.println(c++); //10, 11
		System.out.println(c++ + ++c);// 11, 12, 13, 13 = 24
		System.out.println(c + ++c); //13, 14, 14 = 27
		
		System.out.println(d++ + d--); //10, 11, 11, 10 = 21
		System.out.println(d); //10
		System.out.println(--d);//9
		System.out.println(d--);//9
		System.out.println(d);//8
		

	}

}
