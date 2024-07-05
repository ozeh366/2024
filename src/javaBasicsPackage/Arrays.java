package javaBasicsPackage;

public class Arrays {
	
	int array[];

	public static void main(String[] args) {
	
		//Single dimensional array
		
		int b[] = {1, 2, 3, 4,5};
		System.out.println(b.length);
		
		String name[] = {"java", "is", "easy"};
		
		for (int a = -0; a < name.length; a++) {
			System.out.println("position of a = " + a +" " + name[a]);
		}
		
		Object myArray[] = {"Rawlings", "is", 'a', "man", "age", 37}; 
		
		System.out.println(myArray[5]);
		
		myArray[5] = 35;		//modify array
		System.out.println(myArray[5]);
		System.out.println(myArray.length);
		
		// Multidimensional arrays
		
		int [][] array; // declare a 2D array
		
		array = new int[4][3]; // initialize array with 3 rows and 4 columns (define the array)
		
		array [0][0] = 1; // modify the array
		array [3][1] = 9; // modify the array
		
		//inner loop - to iterate through the rows
		for (int i = 0; i < array.length; i++) {
				
			//outer loop - to iterate through the columns
			for (int t = 0; t < array[i].length; t++) {
				
				  System.out.print(array[i][t] + " ");
					
				} System.out.println(); // add a new line after each row
		}
			
		// define the 2D array
		

		int d2[][] = {{1,2,3 }, {2,3,4, 9}, {4, 5, 6, 9}, {7, 8, 9, 9}}; // create and initialize the array
		
		// Total no of rows OR System.out.println(d2.length);
		int row = d2.length;
		System.out.println("Total no of rows is " + row); 
		
		//Total number of columns OR System.out.println(d2[0].length);
		int column = d2[0].length;
		System.out.println("Total no of columns is " + column);
		
		//Print all data
		
		for (int a1 = 0; a1 < row; a1++) {
			
				for (int b1 = 0; b1 < column; b1++) {
					
					System.out.print(d2[a1][b1] + " ");
					
				} 	System.out.println();
		}
		
		//Print reverse numbers
		
		int nums[] = {1, 2, 3, 4, 5, 5};
		int reversed[] = new int [nums.length]; 
		
		for (int i = 0; i < nums.length; i++) {
			reversed[i] = nums[nums.length - 1 - i]; // Assign reversed numbers
		}
		
		 // Print the reversed array
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        
        //OR
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array

        // Loop from the end of the array to the beginning
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]); // Print each number in reverse order
	}
  }

}
