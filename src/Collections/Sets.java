package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sets {
	
	/*Sets are collections that do not allow duplicate elements. 
	 * The main implementations are HashSet, LinkedHashSet, and TreeSet.
	 */
	

	public static void main(String[] args) {
		 Set<String> sett = new HashSet<>();
	        sett.add("Apple");
	        sett.add("Banana");
	        sett.add("Cherry");
	        sett.add("Apple"); // This will not be added as it's a duplicate
	        
	        //Iterate through the set
	        for (String r : sett) {
	        	System.out.println(r);
	        }
	        
	        //Print numbers backward
	        
	        IntStream.rangeClosed(1, 10)  // Generates numbers from 1 to 10
            .map(i -> 11 -i)  // Maps each number to its reverse position
            .forEach(System.out::println);
	        
	       
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    		numbers.stream()
           .sorted(Comparator.reverseOrder())  // Sorts the stream in reverse order
           .forEach(System.out::println);
	        /*Additional Stream Operations
			Here are some other common operations you can perform on streams:
			
			1. forEach: Performs an action for each element.
			
			numbers.stream().forEach(System.out::println);
			
			2. reduce: Combines elements of the stream into a single result.
		
			int sum = numbers.stream().reduce(0, Integer::sum);
			System.out.println(sum); // Outputs: 15
			
			3. sorted: Returns a stream with elements sorted.
			
			List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedNumbers); // Outputs: [1, 2, 3, 4, 5]
			
			4. distinct: Returns a stream with duplicate elements removed.
		
			Set<Integer> duplicateNumbers = new HashSet<>(List.of(1, 2, 2, 3, 3, 3));
			List<Integer> distinctNumbers = duplicateNumbers.stream().distinct().collect(Collectors.toList());
			System.out.println(distinctNumbers); // Outputs: [1, 2, 3]
			
			5. Printing Numbers in Reverse Order Using IntStream
			
			 IntStream.rangeClosed(1, 10)  // Generates numbers from 1 to 10
                 .map(i -> 11 - i)    // Maps each number to its reverse position
                 .forEach(System.out::println);
	         
           List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        		numbers.stream()
               .sorted(Comparator.reverseOrder())  // Sorts the stream in reverse order
               .forEach(System.out::println);
	         */
	}
}
