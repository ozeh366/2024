package Collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	/*A HashMap in Java is part of the Java Collections Framework and is used to store data in key-value pairs.
	    It implements the Map interface, which allows for fast retrieval, insertion, and deletion of data based on the key. 
	    HashMap is one of the most widely used data structures when working with Java due to its efficiency and flexibility.

		Key Characteristics of HashMap:
		Unordered: The elements in a HashMap are not ordered. The order of insertion is not retained, and the data structure itself does not guarantee any specific order of the keys.
		
		Key-Value Pairs: Each element in a HashMap is a key-value pair. The keys are unique, and each key maps to exactly one value.
		
		Null Keys and Values: HashMap allows for one null key and multiple null values.
		
		Hashing: HashMap uses the hash code of the key to determine where the key-value pair should be stored. 
		If two keys have the same hash code, a collision occurs, and the HashMap handles it by storing the key-value pairs in a linked list or tree structure within the same hash bucket.
		
		Basic Operations:
		
		Put: To add a key-value pair to the map.
		Get: To retrieve the value associated with a key.
		Remove: To remove the key-value pair associated with a key.
		ContainsKey: To check if a specific key exists in the map.
		ContainsValue: To check if a specific value exists in the map.
		KeySet: To get a set of all keys in the map.
		Values: To get a collection of all values in the map.
		
		Use Cases:
			HashMap is ideal for scenarios where quick lookup, insertion, and deletion of data based on keys are required, 
			such as implementing caches, tracking unique identifiers, or counting occurrences of objects
	 	*/
	
		public static void main(String[] args) {
			 // Creating a HashMap
	        Map<String, Integer> map = new HashMap<>();
	
	        // Adding key-value pairs to the HashMap
	        map.put("Alice", 30);
	        map.put("Bob", 25);
	        map.put("Charlie", 35);
	
	        // Accessing values
	        System.out.println("Age of Bob: " + map.get("Bob")); // Outputs 25
	        
	        // Checking if a key exists
	        if (map.containsKey("Bob")) {
	            System.out.println("Alice is in the map");
	        }
	
	        if (map.containsValue(35)) {
	            System.out.println("A 35year old is in the map");
	        }
	        // Iterating over key-value pairs
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	
	        // Remove a key from the map
	        map.remove("Charlie");
	
	        // Print the current state of the map
	        System.out.println(map);
		
	}

}
