package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListExample{
	
	/*A List in Java is an ordered collection (also known as a sequence).
	 * Lists can contain duplicate elements and are exactly what they sound like: a list of elements, each accessible by an index. 
	 * Here are some key points and an example using ArrayList, a commonly used implementation of the List interface:

		Features:
		
		1. Elements can be inserted or accessed by their position in the list, using a zero-based index.
		2. Allows duplicate elements.
		3. Maintains the insertion order.		
	 * 
	 *  Use Case
		Array:
		
		Suitable for fixed-size collections that are not expected to change in size.
		Preferred when performance is critical and the size is known upfront.
		
		List:
		
		Ideal for cases where the amount of data can change dynamically.
		More suitable when you need extensive features and operations that facilitate easy data manipulation.
	 */
	
	 public static void main(String[] args) {
	
		//List<dataType> variableName = new ArrayList<>();
		 
	        List<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Apple");  // List allows duplicates

	        System.out.println(fruits.get(1));  // Outputs: Banana
	        
	        
	        for (String f : fruits) {
	        	System.out.println(f);
	        } System.out.println();
	        
	       //List<dataType> variableName = new ArrayList<>();
	       
	        List<Integer> nums = new ArrayList<>();
	        nums.add(5000);
	        nums.add(0);
	        System.out.println(nums.get(0));
	        System.out.println(nums.get(1));
	        System.out.println(nums.size());
	        
	        //iterate through the list
	        for (int r : nums) {
	        	System.out.print(r);
	        }System.out.println();
	        
	     // Create a set of integers
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	       
	        
	        // Use stream to filter, map, and collect results
	        List<Integer> processedNumbers = numbers.stream() // numbers.stream to create the stream
	            .filter(number -> number % 2 != 0) // Keep only odd numbers
	            .map(number -> number * 2)         // Multiply each number by 2
	            .collect(Collectors.toList());     // Collect results into a list

	        // Print the results
	        System.out.println(processedNumbers); // Outputs: [2, 6, 10]
	        
	        //Return duplicates
	        List<Integer> in = new ArrayList<>();
	        
	        in.add(1);
	        in.add(1);
	        in.add(3);
	        in.add(14);
	        in.add(5);
	        
	      //Collect duplicate numbers
	        List<Integer> dup = in.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // This part creates a Map where each key is a num, and each value is the count of that fruit in the list.
                .entrySet().stream() // The entrySet of the map is converted to a stream, and entries with a count greater than 1 are filtered out. 
                .filter(entry -> entry.getValue() > 1) // This means only duplicates are retained.
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()); //The keys (fruit names) of the remaining entries are collected into a new list.
	        
	        	System.out.println(dup); // Outputs: [1]
	        
	      //Collect duplicate fruits
        	List<String> duplicates = fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by fruit name and count occurrences
                .entrySet().stream() // The entrySet of the map is converted to a stream
                .filter(entry -> entry.getValue() > 1) // Retain only entries with a count greater than 1
                .map(Map.Entry::getKey) // Map to the keys (fruit names) of the remaining entries
                .collect(Collectors.toList()); // Collect the keys into a list

	            // Print the duplicates
	            System.out.println(duplicates); // 
	 }

}
