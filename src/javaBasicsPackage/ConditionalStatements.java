package javaBasicsPackage;

public class ConditionalStatements {
	

	public static void main(String[] args) {
		
		
		//IF statement -- It is used to test the condition
		
		int a = 9;
		
		if (a > 8) {
			System.out.println("a is greater than 10"); //
		}
		
		//IF-Els statement -- It is used to test the condition. The else block will execute if the condition is false
		
		if (a > 10) {
			System.out.println("a is greater than 10");
		} else {
			System.out.println("a is not greater than 10");// else will executed
		}
		
		//IF-Else-IF -- Only the first True condition will be executed
		
		int b = 10;
		
		if (b == 9) {
			System.out.println("Incorrect");
		} else if (b == 10) {
			System.out.println("correct");// only first true condition will be executed. End of program
		}else if (b >= 10) {
			System.out.println("still correct"); // True but will not be executed
		}else {
			System.out.println("wrong");
		}
		
		//Nested IF - The inner block will execute if the outer box is true
		/* The outer if condition is evaluated first.
		 * If the outer condition is true, the inner if condition is checked.
		 * If both the outer and inner conditions are true, the block of code inside the inner if statement is executed.
		 * If outer block is correct and inner block is false, the inner block else will execute
		 * If outer block is incorrect, the inner block will not be checked and the final else will execute
		 */

		int maxAge = 10;
		int maxWeight = 55;
		
		//Outer Block
		if (maxAge == 10) {

			//inner block
			if (maxWeight == 50) {
					System.out.println("Eligible");
			}else {
				System.out.println("Not Eligible");
			}
			
			}else {
				System.out.println("either age or weight is wrong");
			}
		
		isEligible(18, 5);
	}
	public static int isEligible( int maxAge, int maxWeight) {
		
		if (maxAge >= 18) {

			if (maxWeight == 55) {
				System.out.println("eligible");
				
			}else {
				System.out.println("Not Eligible");
			}
			
			}else {
				System.out.println("age or weight does not match");
			}
		
			return 0;
	}
}
